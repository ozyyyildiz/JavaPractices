package com.proje.test;

import java.util.Calendar;
import java.util.Date;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositoryImpl;

public class Test {

	public static void main(String[] args) {
		
		BookRepository bookRepository = new BookRepositoryImpl();
		
		Book book = new Book(1, "Memeler baþ kaldýrmýþ", "Ozan Yýldýz", "Erotik", 69, createDate(28,06,1996));
		
		Book book1= new Book(2, "Kavuþmuyor Düðmeler", "Ozan Yýldýz", "Erotik", 70, createDate(29,06,1996));
		
		bookRepository.save(book);
		
		bookRepository.save(book1);

	}
	
	public static Date createDate(int day, int month, int year) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		
		return calendar.getTime();
		
	}

}
