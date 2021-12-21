package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.config.AppConfig;
import com.proje.db.DBConnection;

public class TestAnnotation {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DBConnection dbConnection = appcontext.getBean(DBConnection.class);
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		
		appcontext.close();
	}

}
