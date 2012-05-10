package com.blog.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("ADMIN")

public class AdminUser extends User implements Serializable {

	private static final long serialVersionUID = 1L;	
	@OneToMany(mappedBy="user")
	private List<Post> AdminPosts;
	
	public AdminUser() {}
	
	public List<Post> getAdminPosts() {
		return AdminPosts;
	}
	public void setAdminPosts(List<Post> adminPosts) {
		AdminPosts = adminPosts;
	}

}
