package com.blog.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Database {
	public static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("javablog");

}
