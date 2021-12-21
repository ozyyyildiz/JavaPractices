package com.proje.test;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Student;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Student student = new Student("Ozan", "Yýldýz", createDate(28, 06, 1996));
		Student student1 = new Student("Ozan", "Yýldýz", createDate(28, 06, 1999));
		
		transaction.begin();
		
		entityManager.persist(student);
		entityManager.persist(student1);
		
		transaction.commit();
	}
	
	public static Date createDate(int day, int month, int year) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}

}
