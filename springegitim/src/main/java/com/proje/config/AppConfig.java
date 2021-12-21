package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;

@Configuration
public class AppConfig {
	
	@Bean
	public DBConnection dbConnection() {
		
		DBConnection dbConnection = new DBConnection();
		dbConnection.setUrl("mysqllocalhost");
		dbConnection.setUsername("Root");
		dbConnection.setPassword("ozanozan");
		
		return dbConnection;
	}

}
