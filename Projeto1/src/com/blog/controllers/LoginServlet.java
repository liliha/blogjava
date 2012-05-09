package com.blog.controllers;

import java.io.IOException;
import java.util.List;

import com.blog.dao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blog.models.User;


@WebServlet("/Login")

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
    	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDAO uDAO = new UserDAO();
        uDAO.begin();
        
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        User u = uDAO.findByEmail(user.getEmail());
	    uDAO.close();
	    
	    if ((u != null) && user.getPassword().equals(u.getPassword())) {
	    	session.setAttribute("isLoggedIn", true);
			session.setAttribute("userLogin", email);
			response.sendRedirect(request.getContextPath());
	    }
	    else {
	    	session.setAttribute("msg", "E-mail ou senha inv&aacute;lidos.");
	    	response.sendRedirect("logina.jsp");
	    }
		
	}

}
