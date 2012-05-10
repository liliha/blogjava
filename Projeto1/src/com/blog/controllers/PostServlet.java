package com.blog.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.dao.PostDAO;
import com.blog.models.Post;

@WebServlet("/Post")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PostServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equals("show")) {
			
			Integer id = Integer.parseInt(request.getParameter("id"));
			
			PostDAO pDAO = new PostDAO();
			pDAO.begin();
			Post post = new Post();
			post.setId(id);
			Post tPost = pDAO.findByID(post.getId());
			pDAO.close();			
			request.setAttribute("postObj", tPost);
			RequestDispatcher rd = request.getRequestDispatcher("postView.jsp");
			rd.forward(request, response);
			
		}
		
		if(action.equals("show")) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			PostDAO pDAO = new PostDAO();
			pDAO.begin();
			Post tPost = new Post();
			pDAO.persist(tPost);
			pDAO.commit();
			pDAO.close();
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
