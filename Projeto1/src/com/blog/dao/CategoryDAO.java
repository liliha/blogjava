package com.blog.dao;

import com.blog.models.Category;

public class CategoryDAO extends JPADao<Category>{
	
	public CategoryDAO(){
		super();
	}
	
	public Category findById(int id) {
		return (Category) super.findByQuery("SELECT c FROM Category c WHERE c.id = " + id);
	}
	
}
