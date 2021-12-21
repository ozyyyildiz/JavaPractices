package com.proje.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.proje.jpaFactory.JPAFactory;
import com.proje.jpaFactory.impl.JPAFactoryImpl;
import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.model.ProductDetails;
import com.proje.queries.ProductQueries;
import com.proje.repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository{
	
	private JPAFactory jpaFactory = new JPAFactoryImpl();
	
	private EntityManager entityManager = jpaFactory.getEntityManager();
	
	private EntityTransaction transaction = jpaFactory.getTransaction();
	
	@Override
	public Product saveProduct(Product product) {
		
		transaction.begin();
		
		entityManager.persist(product);
		
		transaction.commit();
		
		return product;
		
	}

	@Override
	public Brand saveBrand(Brand brand) {
		
		transaction.begin();
		
		entityManager.persist(brand);
		
		transaction.commit();
		
		return brand;
		
	}

	@Override
	public Category saveCategory(Category category) {
		
		transaction.begin();
		
		entityManager.persist(category);
		
		transaction.commit();
		
		return category;
		
	}

	@Override
	public List<Product> findProducts() {
//		Query query = entityManager.createQuery(ProductQueries.findProducts);
//		
//		List<Product> products = query.getResultList();
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findProducts, Product.class);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Product> findProductsEntities(int firstResult, int maxResult) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findProducts, Product.class);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public Product findProductById(int productId) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findProductById, Product.class);
		typedQuery.setParameter("productId", productId);
		
		Product product = typedQuery.getSingleResult();
		
		return product;
	}

	@Override
	public List<ProductDetails> findProductDetails() {
		
		TypedQuery<ProductDetails> typedQuery = entityManager.createQuery(ProductQueries.findProductDetails, ProductDetails.class);
		
		List<ProductDetails> productDetails = typedQuery.getResultList();
		
		return productDetails;
	}

	@Override
	public ProductDetails findProductDetailsById(int productId) {
		
		TypedQuery<ProductDetails> typedQuery = entityManager.createQuery(ProductQueries.findProductDetailById, ProductDetails.class);
		typedQuery.setParameter("productId", productId);
		
		ProductDetails productDetails = typedQuery.getSingleResult();
		
		return productDetails;
	}

	@Override
	public List<String> findProductNames() {
		
		TypedQuery<String> typedQuery = entityManager.createQuery(ProductQueries.findProductNames, String.class);
		
		List<String> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Object[]> findProductNameAndPrice() {
		
		Query query = entityManager.createQuery(ProductQueries.findProductNamePrice);
		
		@SuppressWarnings("unchecked")
		List<Object[]> products = query.getResultList();
		
		return products;
	}

	@Override
	public List<Product> findGreatPrice(double price) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findGreatPrice, Product.class);
		typedQuery.setParameter("price", price);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Product> findGreatAndLessPrice(double minUnitPrice, double maxUnitPrice) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findGreatLessPrice, Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Product> findBetweenPrice(double minUnitPrice, double maxUnitPrice) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findBetweenPrice, Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Product> findLikeProductName(String productName) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findLikeProductName, Product.class);
		typedQuery.setParameter("productName", "%" + productName + "%");
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Product> findInCategoryName(String categoryName1, String categoryName2) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findInCategoryName, Product.class);
		typedQuery.setParameter("categoryName1", categoryName1);
		typedQuery.setParameter("categoryName2", categoryName2);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Product> findAllProduct(int cateogryId) {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findAllProduct, Product.class);
		typedQuery.setParameter("cateogryId", cateogryId);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Object[]> findFunctionsPrice() {
		
		Query query = entityManager.createQuery(ProductQueries.findFunctionsPrice);
		
		List<Object[]> functionPrice = query.getResultList();
		
		return functionPrice;
	}

	@Override
	public List<Object[]> findGroupByCategory() {
		
		Query query = entityManager.createQuery(ProductQueries.findGroupByCategory);
		
		List<Object[]> groupByCategory = query.getResultList();
		
		return groupByCategory;
	}

	@Override
	public List<Object[]> findGroupByHavingCategory(double price) {
		
		Query query = entityManager.createQuery(ProductQueries.findGroupByHavingCategory);
		
		List<Object[]> havingCategory = query.getResultList();
		
		return havingCategory;
	}

	@Override
	public List<Product> findOrderByPrice() {
		
		TypedQuery<Product> typedQuery = entityManager.createQuery(ProductQueries.findOrderByPrice, Product.class);
		
		List<Product> products = typedQuery.getResultList();
		
		return products;
	}

}
