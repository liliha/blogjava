package com.blog.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
public class Post implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue	(strategy=GenerationType.IDENTITY)
	@OrderBy("addDate DESC")
	@Column(name="POST_ID")
	private int id;
	@ManyToOne
	private User user;
	@Temporal(TemporalType.DATE)
	private Date addDate;
	@Column
	private String title;
	@Column
	private String content;
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="POST_CATEGORY", joinColumns={@JoinColumn(name="POST_ID", referencedColumnName="POST_ID")}, inverseJoinColumns={@JoinColumn(name="CATEGORY_ID", referencedColumnName="CATEGORY_ID")})
	private List<Category> categories;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="post", fetch=FetchType.EAGER)
	private List<Comment> comments;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="post", fetch=FetchType.EAGER)
	private List<Tag> tags;
	@Column
	private boolean isPublished;
	
	public Post() {}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Post [id=" + id + ", user=" + user + ", addDate=" + addDate
				+ ", title=" + title + ", content=" + content + ", categories="
				+ categories + ", comments=" + comments + ", tags=" + tags
				+ ", isPublished=" + isPublished + "]";
	}

}
