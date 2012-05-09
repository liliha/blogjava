package com.blog.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("ADMIN")

public class AdminUser extends User implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	public AdminUser() {}

}
