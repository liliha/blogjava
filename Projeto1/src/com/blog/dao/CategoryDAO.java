package com.blog.dao;

import java.util.ArrayList;
import java.util.List;

import com.blog.models.Category;

public class CategoryDAO extends JPADao<Category>{
	
	private List categories = new ArrayList();
	
	public CategoryDAO(){
		super();
	}

	public List getCategories() {
		return categories;
	}

	public void setCategories(List categories) {
		this.categories = categories;
	}
	
}
