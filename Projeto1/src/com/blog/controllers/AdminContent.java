package com.blog.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.dao.CategoryDAO;
import com.blog.dao.PostDAO;
import com.blog.dao.UserDAO;
import com.blog.models.Category;
import com.blog.models.Post;
import com.blog.models.User;

@WebServlet("/admin/")
public class AdminContent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminContent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO uDAO = new UserDAO();
		uDAO.begin();
		List<User> users = uDAO.findAll();
		request.setAttribute("users", users);
		uDAO.close();
		PostDAO pDAO = new PostDAO();
		pDAO.begin();
		List<Post> posts = pDAO.findAll();
		request.setAttribute("posts", posts);
		pDAO.close();
		CategoryDAO cDAO = new CategoryDAO();
		cDAO.begin();
		List<Category> categories = cDAO.findAll();
		request.setAttribute("categories", categories);
		cDAO.close();
		
		RequestDispatcher rd = request.getRequestDispatcher("/admin/index.jsp");
		rd.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
