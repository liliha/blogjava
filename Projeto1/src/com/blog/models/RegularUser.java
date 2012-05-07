package com.blog.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("REGULAR")

public class RegularUser extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private boolean isMuted;
	
	public RegularUser() {}
		

	public boolean isMuted() {
		return isMuted;
	}

	public void setMuted(boolean isMuted) {
		this.isMuted = isMuted;
	}
	
}
