package com.proje.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.proje.model.Book;
import com.proje.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository{
	
	EntityManager entityManager = jpaFactory.getEntityManager();
	
	EntityTransaction transaction = jpaFactory.getEntityTransaction();
	
	@Override
	public void save(Book book) {
		
		transaction.begin();
		
		entityManager.persist(book);
		
		transaction.commit();
	}

	@Override
	public void delete(Book book) {
		transaction.begin();
		entityManager.remove(book);
		transaction.commit();
	}
	
	@Override
	public Book find(int id) {
		Book book = entityManager.find(Book.class, id);
		
		if(book!=null) {
			return book;
		}
		return null;
	}

	@Override
	public Book update(Book book) {
		
		transaction.begin();
		
		Book updated = entityManager.merge(book);
		
		transaction.commit();
		return updated;
	}

}
