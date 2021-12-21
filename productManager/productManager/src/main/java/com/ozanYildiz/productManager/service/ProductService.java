package com.ozanYildiz.productManager.service;

import java.util.List;

import com.ozanYildiz.productManager.model.Product;

public interface ProductService {
	
	void saveProduct(Product product);
	
	List<Product> findAll();
	
	List<Product> findByCategory(int id);
	
	Product findById(int id);
	
	void updateProduct(Product product);
	
	void deleteProduct(int id);

}
