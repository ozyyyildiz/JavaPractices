package com.proje.db;

public class DBConnection {
	
	private Database database;
	
	public void openConnection() {
		System.out.println("Url: " + this.database.getUrl());
		System.out.println("username: " + this.database.getUsername());
		System.out.println("password: " + this.database.getPassword());
		
		System.out.println("Ba�lant� yap�ld�.");
	}
	
	public void closeConnection() {
		System.out.println("Ba�lant� kapat�ld�.");
	}
	
	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public Database getDatabase() {
		return database;
	}

}
