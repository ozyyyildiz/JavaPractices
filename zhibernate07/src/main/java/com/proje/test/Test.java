package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Address;
import com.proje.model.Customer;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Customer customer = new Customer("Ozan", "Yýldýz", new Date());
		
		Address address = new Address("Okurlar Caddesi Esenyurt", "Ýstanbul", 34486);
		
		customer.setAddress(address);
		
		transaction.begin();
		
		entityManager.persist(address);
		entityManager.persist(customer);
		
		transaction.commit();

	}

}
