package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Contact;
import com.proje.model.User;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		User user = new User("cortigo", "12345", new Contact("05078688488", "ozyy1996@gmail.com", "ozy.com"), new Date());
		
		transaction.begin();
		
		entityManager.persist(user);
		
		transaction.commit();
		
	}

}
