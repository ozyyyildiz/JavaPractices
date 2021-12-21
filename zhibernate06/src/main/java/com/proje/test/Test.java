package com.proje.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Personel;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Personel personel = new Personel("Ozan", "Yýldýz", new Date());
		Personel personel2 = new Personel("Kita", "Usagi", new Date());
		
		personel.addPhoneNumber("0111111111");
		personel.addPhoneNumber("5445445646");
		personel2.addPhoneNumber("454654346574");
		personel2.addPhoneNumber("7465746541687");
		
		transaction.begin();
		
		entityManager.persist(personel);
		entityManager.persist(personel2);
		
		transaction.commit();

	}

}
