package com.proje.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int productId;
	
	private String name;
	
	private double price;
	
	private int available;
	
	@ManyToOne
	@JoinColumn(name="brandId")
	private Brand brand;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Temporal(TemporalType.DATE)
	private Date updateDate;
	
	public Product() {
		
	}

	public Product(String name, double price, int available, Brand brand, Category category, Date addDate) {
		this.name = name;
		this.price = price;
		this.available = available;
		this.brand = brand;
		this.category = category;
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", available=" + available
				+ ", brand=" + brand + ", category=" + category + ", addDate=" + addDate + ", updateDate=" + updateDate
				+ "]";
	}
	
	

}
