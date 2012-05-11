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
import com.blog.models.Category;
import com.blog.models.Post;

@WebServlet("/CategoriesPostServlet")
public class CategoriesPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public CategoriesPostServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CategoryDAO cDAO = new CategoryDAO();
		cDAO.begin();
		List<Category> categories = cDAO.findAll();
		cDAO.close();			
		request.setAttribute("categoriesObj", categories);
		RequestDispatcher rd = request.getRequestDispatcher("addPost.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
