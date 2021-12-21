package com.ozanYildiz.productManager.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ozanYildiz.productManager.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	
	private EntityManager entityManager;
	
	@Autowired
	public CategoryDaoImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}

	@Override
	public List<Category> findAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Category> categories = session.createQuery("from Category",Category.class).getResultList();
		return categories;
	}

	@Override
	public Category getCategory(int id) {
		Session session = entityManager.unwrap(Session.class);
		Category category = session.get(Category.class, id);
		return category;
	}

	@Override
	public void saveCategory(Category category) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
	}

	@Override
	public void deleteCategory(int id) {
		Session session = entityManager.unwrap(Session.class);
		Category category = session.get(Category.class, id);
		session.remove(category);

	}

}
