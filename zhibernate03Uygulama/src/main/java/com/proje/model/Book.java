package com.proje.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book {
	
	@Id
	@Column(name="id")
	private int bookId;
	
	private String name;
	
	private String author;
	
	private String topic;
	
	private int pagenum;
	
	@Temporal(TemporalType.DATE)
	private Date publishDate;
	
	public Book() {
		
	}

	public Book(int bookId, String name, String author, String topic, int pagenum, Date publishDate) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.pagenum = pagenum;
		this.topic = topic;
		this.publishDate = publishDate;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	
	

}
