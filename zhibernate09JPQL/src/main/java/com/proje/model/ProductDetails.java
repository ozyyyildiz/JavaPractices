package com.proje.model;

public class ProductDetails {
	
	private String productName;
	
	private double price;
	
	private int available;
	
	private String brandName;
	
	private String categoryName;
	
	public ProductDetails() {
		
	}

	public ProductDetails(String productName, double price, int available, String brandName, String categoryName) {
		this.productName = productName;
		this.price = price;
		this.available = available;
		this.brandName = brandName;
		this.categoryName = categoryName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "ProductDetails [productName=" + productName + ", price=" + price + ", available=" + available
				+ ", brandName=" + brandName + ", categoryName=" + categoryName + "]";
	}
	
	

}
