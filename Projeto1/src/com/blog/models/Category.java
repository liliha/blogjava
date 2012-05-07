package com.blog.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue	(strategy=GenerationType.IDENTITY)
	@Column(name="CATEGORY_ID")
	private int id;
	@Column
	private String name;
	@Column
	private String description;
	
	@ManyToMany(mappedBy="categories")
	private List<Post> posts;

	public Category() {}
	
	public List<Post> getPost() {
		return posts;
	}

	public void setPost(List<Post> posts) {
		this.posts = posts;
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
