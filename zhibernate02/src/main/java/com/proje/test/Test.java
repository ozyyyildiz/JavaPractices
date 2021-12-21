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
		 * TRANSACTION ÝLE UPDATE(MERGE) KOMUTLARI
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
		 * TRANSACTION ÝLE INSERT INTO KOMUTLARI.
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
		 * if else ile yapýlmalý.
		 * System.out.println("Ürün Bilgileri : "); System.out.println("Ürün id: " +
		 * product.getProductId()); System.out.println("Ürün ismi: " +
		 * product.getName()); System.out.println("Ürün fiyat: " + product.getPrice());
		 * System.out.println("Ürün stok: " + product.getAvailable());
		 * System.out.println("Ürün eklenme tarihi: " + product.getAddDate());
		 */
	}

}
