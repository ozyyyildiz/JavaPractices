package com.ozanYildiz.productManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ozanYildiz.productManager.Dao.ProductDao;
import com.ozanYildiz.productManager.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	@Transactional
	public void saveProduct(Product product) {
		this.productDao.saveProduct(product);
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		return this.productDao.findAll();
	}

	@Override
	@Transactional
	public List<Product> findByCategory(int id) {
		return this.productDao.findByCategory(id);
	}

	@Override
	@Transactional
	public Product findById(int id) {
		return this.productDao.findById(id);
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		this.productDao.updateProduct(product);
	}

	@Override
	@Transactional
	public void deleteProduct(int id) {
		this.productDao.deleteProduct(id);
	}

}
