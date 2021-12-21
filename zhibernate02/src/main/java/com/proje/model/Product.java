package com.proje.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product {
	
	@Id
	@Column(name="id")
	private int productId;
	
	private String name;
	
	private double price;
	
	private int available;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date addDate;

	public Product() {
		
	}

	public Product(int productId, String name, double price, int available, Date addDate) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.available = available;
		this.addDate = addDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", available=" + available
				+ ", addDate=" + addDate + "]";
	}
	
	

}
