package com.blog.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blog.dao.CategoryDAO;
import com.blog.dao.PostDAO;
import com.blog.dao.UserDAO;
import com.blog.models.Category;
import com.blog.models.Post;
import com.blog.models.User;

@WebServlet("/Post")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PostServlet() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	HttpSession session = request.getSession();
		
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
		
}

				
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String action = request.getParameter("action");
		
		if(action.equals("add")) {
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			Integer categoryId = Integer.parseInt(request.getParameter("category"));
			Integer published = Integer.parseInt(request.getParameter("published"));
			boolean pubBool = (published == 1) ? true : false; 
   
            
            CategoryDAO cDAO = new CategoryDAO();
            cDAO.begin();
            Category tCategory = cDAO.findById(categoryId);
            cDAO.close();
            
            UserDAO uDAO = new UserDAO();
            uDAO.begin();
            User tUser = uDAO.find(session.getAttribute("userLogin"));
            uDAO.close();            
            
			PostDAO pDAO = new PostDAO();
			pDAO.begin();
			Post tPost = new Post();
			tPost.setAddDate(new Date());
			tPost.setCategory(tCategory);
			tPost.setContent(content);
			tPost.setTitle(title);
			tPost.setUser(tUser);
			tPost.setPublished(pubBool);
			
			pDAO.persist(tPost);
			pDAO.commit();
			pDAO.close();
			
		}

	
		//Editar post
		if(action.equals("edit")){
			
			//pega id do post
			Integer id = Integer.parseInt(request.getParameter("id"));
			
			//instancia objeto PostDAO
			PostDAO pDAO = new PostDAO();
			pDAO.begin();
			Post post = new Post();
			post.setId(id);
			Post tPost = pDAO.findByID(post.getId());
			pDAO.close();
			
			//Redireciona para o jsp para editar com o objeto post
			request.setAttribute("postObj", tPost);
			RequestDispatcher rd = request.getRequestDispatcher("postEdit.jsp");
			rd.forward(request, response);
		}
		
		//Deletar post
		if(action.equals("delete")){
			//pega id do post
			Integer id = Integer.parseInt(request.getParameter("id"));
			
			//instancia objeto PostDAO
			PostDAO pDAO = new PostDAO();
			pDAO.begin();
			Post post = new Post();
			post.setId(id);
			Post tPost = pDAO.findByID(post.getId());
			pDAO.close();
			
		}
		
	}

}
