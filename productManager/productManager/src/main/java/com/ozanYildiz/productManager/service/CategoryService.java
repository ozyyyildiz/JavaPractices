package com.ozanYildiz.productManager.service;

import java.util.List;

import com.ozanYildiz.productManager.model.Category;

public interface CategoryService {
	
	List<Category> findAll();
	
	public Category getCategory(int id);
	
	void saveCategory(Category category);
	
	public void deleteCategory(int id);
}
