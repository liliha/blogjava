package com.blog.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.models.Post;

@WebServlet("/LoadIndex")

public class ListPosts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		List<Post> coisas = new ArrayList<Post>();
		
	//	coisas.add(0, new Post("aaa"));
		//coisas.add(1, new Post("bbb"));
		//coisas.add(2, new Post("ccc"));
		//coisas.add(3, new Post("ddd"));
		//coisas.add(4, new Post("eee"));
		//coisas.add(5, new Post("fff"));
		
		request.setAttribute("listPosts", coisas);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
