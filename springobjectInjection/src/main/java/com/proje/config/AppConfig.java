package com.proje.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.proje.db.Database;


@Configuration
@PropertySource("db.properties")
public class AppConfig {
	
	@Value("${url}")
	private String url;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Bean
	public Database database() {
		Database database = new Database();
		
		database.setUrl(this.url);
		database.setUsername(this.username);
		database.setPassword(this.password);
		
		return database;
	}

}
