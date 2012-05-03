package com.blog.models;

import java.util.Date;

public class Post {
	
	private int id;
	private User user;
	private Date addDate;
	private String title;
	private String content;
	private boolean isPublished;
	
	public Post(int id, User user, String title, String content, boolean isPublished) {
		this.id = id;
		this.user = user;
		this.title = title;
		this.content = content;
		this.isPublished = isPublished;
		this.setAddDate(new Date(System.currentTimeMillis()));
	}

	
	public int getId() {
		return id;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

}
