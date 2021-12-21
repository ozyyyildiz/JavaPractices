package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;

public class TestSpring {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext configAppContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DBConnection dbConnection =(DBConnection) configAppContext.getBean("dbConnection");
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		configAppContext.close();
		
	}

}
