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

@WebServlet(description = "Exibe post em versão completa", urlPatterns = { "/showPost" })
public class ShowPostServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public ShowPostServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Pegar ID do post
         String postID = request.getParameter("postID");
	
         PostDAO pDAO = new PostDAO();
         pDAO.begin();
         Post post = new Post();
         Post p = pDAO.findByID(post.getId());
         pDAO.close();
         
		// Levar dados do post para o jsp
		
		RequestDispatcher rd = request.getRequestDispatcher("Post.jsp");
		rd.forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}