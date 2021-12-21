package com.proje.db;

public class DBConnection {
	
	private Database database;
	
	public void openConnection() {
		System.out.println("Url: " + this.database.getUrl());
		System.out.println("username: " + this.database.getUsername());
		System.out.println("password: " + this.database.getPassword());
		
		System.out.println("Baðlantý yapýldý.");
	}
	
	public void closeConnection() {
		System.out.println("Baðlantý kapatýldý.");
	}
	
	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public Database getDatabase() {
		return database;
	}

}
