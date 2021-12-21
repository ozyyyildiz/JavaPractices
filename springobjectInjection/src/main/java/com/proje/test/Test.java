package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.Database;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext configAppContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Database database =(Database) configAppContext.getBean("database");
		
		System.out.println("URL: " + database.getUrl()); 
		System.out.println("URL: " + database.getUsername()); 
		System.out.println("URL: " + database.getPassword()); 
		
		configAppContext.close();
		
	}

}
