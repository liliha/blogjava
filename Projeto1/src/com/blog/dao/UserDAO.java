package com.blog.dao;

import com.blog.models.User;

public class UserDAO extends JPADao<User> {
	public UserDAO(){
		super();
	}
	
	@SuppressWarnings("unchecked")
	public User findByEmail(String email) {
		return (User) super.findByQuery("SELECT u FROM User u WHERE u.email = \"" + email + "\"");
	}
}
