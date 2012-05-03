package com.blog.models;

import java.util.Date;

public class Comment {
	
	private int id;
	private User user;
	private String title;
	private String message;
	private Date addDate;
	private boolean isApproved;
	
	public Comment(int id, User user, String title, String message, boolean isApproved) {
		this.id = id;
		this.user = user;
		this.title = title;
		this.message = message;
		this.isApproved = isApproved;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	
}
