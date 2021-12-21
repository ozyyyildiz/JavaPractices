package com.ozanYildiz.productManager.Dao;

import java.util.List;

import com.ozanYildiz.productManager.model.Category;

public interface CategoryDao {
	List<Category> findAll();
	
	public Category getCategory(int id);
	
	void saveCategory(Category category);
	
	public void deleteCategory(int id);
}
