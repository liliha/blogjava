package com.blog.dao;

import com.blog.models.Post;

public class PostDAO extends JPADao<Post>{
	public PostDAO(){
		super();
	}
	
	public Post findByID(Integer postID) {
		return (Post) super.findByQuery("SELECT p FROM Post p WHERE p.id = \"" + postID + "\"");
	}
}
