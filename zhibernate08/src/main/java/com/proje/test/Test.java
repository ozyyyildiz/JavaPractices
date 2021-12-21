package com.proje.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Product;
import com.proje.model.User;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		User user = new User("Ozan", "Yýldýz", new Date());
		
		Product product = new Product("iPhone", 8, 8860, new Date());
		Product product2 = new Product("Zemzang", 8, 8860, new Date());
		List<Product> products = Arrays.asList(product,product2);
		
		user.setProducts(products);
		
		transaction.begin();
		
		entityManager.persist(user);
		entityManager.persist(product);
		entityManager.persist(product2);
		
		transaction.commit();

	}

}
