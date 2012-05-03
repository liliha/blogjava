package com.blog.models;

public class Tag {
	
	private int id;
	private String name;
	private Post post;
	
	public static void main(String[] args) {
	
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
