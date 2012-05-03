package com.blog.models;

public class Tag {
	
	private int id;
	private String name;
	private Post post;
	
	public Tag(int id, String name, Post post) {
		this.id = id;
		this.name = name;
		this.post = post;
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
