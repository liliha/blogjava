package com.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	@GeneratedValue	(strategy=GenerationType.IDENTITY)
	private int id;
	private String login;
	private String name;
	private String email;
	private String password;
	private boolean hasAdminPrivs;
		
	public User(int id, String login, String name, String email, String password, boolean hasAdminPrivs) {
		this.id = id;
		this.login = login;
		this.name = name;
		this.email = email;
		this.password = password;
		this.hasAdminPrivs = hasAdminPrivs;
	}

	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getHasAdminPrivs() {
		return hasAdminPrivs;
	}

	public void setHasAdminPrivs(boolean hasAdminPrivs) {
		this.hasAdminPrivs = hasAdminPrivs;
	}

}
