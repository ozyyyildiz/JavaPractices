package com.ozanYildiz.productManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ozanYildiz.productManager.Dao.CategoryDao;
import com.ozanYildiz.productManager.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	private CategoryDao categoryDao;
	
	@Autowired
	public CategoryServiceImpl(CategoryDao categoryDao) {
		this.categoryDao=categoryDao;
	}

	@Override
	@Transactional
	public List<Category> findAll() {
		return this.categoryDao.findAll();
	}

	@Override
	@Transactional
	public Category getCategory(int id) {
		return this.categoryDao.getCategory(id);
	}

	@Override
	@Transactional
	public void saveCategory(Category category) {
		this.categoryDao.saveCategory(category);

	}

	@Override
	@Transactional
	public void deleteCategory(int id) {
		this.categoryDao.deleteCategory(id);

	}

}
