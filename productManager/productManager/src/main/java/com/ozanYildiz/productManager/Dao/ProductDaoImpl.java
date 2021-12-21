package com.ozanYildiz.productManager.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ozanYildiz.productManager.model.Category;
import com.ozanYildiz.productManager.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	private EntityManager entityManager;
	
	@Autowired
	public ProductDaoImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}

	@Override
	public void saveProduct(Product product) {
		Session session = entityManager.unwrap(Session.class);
		Category category = session.createQuery("from Category c where c.name = :name", Category.class).setParameter("name", product.getCategory().getName()).getSingleResult();
		category.add(product);
		product.setCategory(category);
		session.saveOrUpdate(product);
	}

	@Override
	public List<Product> findAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Product> products = session.createQuery("from Product", Product.class).getResultList();
		return products;
	}
	
	@Override
	public List<Product> findByCategory(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query<Product> query = session.createQuery("from Product where category_id = :id ", Product.class);
		query.setParameter("id", id);
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public Product findById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Product product = session.get(Product.class, id);
		return product;
	}

	@Override
	public void updateProduct(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.update(product);
	}

	@Override
	public void deleteProduct(int id) {
		Session session = entityManager.unwrap(Session.class);
		Product product = session.get(Product.class, id);
		session.remove(product);
	}

}
