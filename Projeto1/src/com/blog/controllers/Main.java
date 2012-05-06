package com.blog.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	private static final String PERSISTENCE_UNIT_NAME = "javablog";
	private EntityManagerFactory emf;
	private EntityManager em;

	public static void main(String[] args) {
		Main main = new Main();
		main.initEntityManager();
	}

	private void initEntityManager() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		setEm(emf.createEntityManager());
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}