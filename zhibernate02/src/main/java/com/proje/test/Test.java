package com.proje.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Product;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Product product = entityManager.find(Product.class, 3);
		
		transaction.begin();
		entityManager.remove(product);
		transaction.commit();
		
		
		/*
		 * TRANSACTION �LE UPDATE(MERGE) KOMUTLARI
		 * 
		 * Product product = entityManager.find(Product.class, 2);
		 * 
		 * product.setPrice(55555);
		 * 
		 * transaction.begin();
		 * 
		 * entityManager.merge(product);
		 * 
		 * transaction.commit();
		 */
		
		/*
		 * TRANSACTION �LE INSERT INTO KOMUTLARI.
		 * 
		 * transaction.begin();
		 * 
		 * Product product1 = new Product(3, "iPhone 11", 36555, 1, new Date());
		 * 
		 * entityManager.persist(product1);
		 * 
		 * transaction.commit();
		 */
		
		/*
		 * TRANSACTIONSIZ FIND KOMUTLARI
		 * 
		 * Product product = entityManager.find(Product.class, 2);
		 * 
		 * if else ile yap�lmal�.
		 * System.out.println("�r�n Bilgileri : "); System.out.println("�r�n id: " +
		 * product.getProductId()); System.out.println("�r�n ismi: " +
		 * product.getName()); System.out.println("�r�n fiyat: " + product.getPrice());
		 * System.out.println("�r�n stok: " + product.getAvailable());
		 * System.out.println("�r�n eklenme tarihi: " + product.getAddDate());
		 */
	}

}
