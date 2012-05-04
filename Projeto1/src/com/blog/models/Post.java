package com.blog.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private int id;
	private User user;
	private Date addDate;
	private String title;
	private String content;
	private List<Category> categories = new ArrayList<Category>();
	private List<Comment> comments = new ArrayList<Comment>();
	private List<Tag> tags = new ArrayList<Tag>();
	private boolean isPublished;
	private String x;
	
	@Override
	public String toString() {
		return "Post [x=" + x + "]";
	}

	public Post(String x) {
		this.x = x;
};
	
	/*public Post(int id, User user, String title, String content, List<Category> categories, List<Comment> comments, List<Tag> tags, boolean isPublished) {
		this.id = id;
		this.user = user;
		this.title = title;
		this.content = content;
		this.categories = categories;
		this.comments = comments;
		this.tags = tags;
		this.isPublished = isPublished;
		this.setAddDate(new Date(System.currentTimeMillis()));
	}*/

	
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
	
	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public List<Tag> getTags() {
		return tags;
	}


	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}


	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

	public List<Post> listar() {
		
		List<Post> coisas = new ArrayList<Post>();
		coisas.add(0, new Post("aaa"));
		coisas.add(1, new Post("bbb"));
		coisas.add(2, new Post("ccc"));
		coisas.add(3, new Post("ddd"));
		coisas.add(4, new Post("eee"));
		coisas.add(5, new Post("fff"));
		
		return coisas;
	}

}