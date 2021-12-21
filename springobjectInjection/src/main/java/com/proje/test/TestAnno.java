package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.db.DBConnection;
import com.proje.db.Database;

public class TestAnno {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Database database = appContext.getBean(Database.class);
		
		System.out.println("Url: "+database.getUrl());
		System.out.println("Username: "+database.getUsername());
		System.out.println("Password: "+database.getPassword());
		
		
		appContext.close();
	}
}
