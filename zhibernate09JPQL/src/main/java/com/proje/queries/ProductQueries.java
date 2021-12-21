package com.proje.queries;

public class ProductQueries {
	
	public static final String findProducts = "SELECT p FROM Product p";
	
	public static final String findProductById = "SELECT p FROM Product p WHERE p.id = :productId";
	
	public static final String findProductDetails = "SELECT new com.proje.model.ProductDetails(p.name, p.price, p.available, b.name, c.name)"
												  + "FROM Product p LEFT JOIN p.brand b LEFT JOIN p.category c";
	
	public static final String findProductDetailById = "SELECT new com.proje.model.ProductDetails(p.name, p.price, p.available, b.name, c.name)"
													 + "FROM Product p LEFT JOIN p.brand b LEFT JOIN p.category c WHERE p.id= :productId";
	
	public static final String findProductNames = "SELECT p.name FROM Product p";
	
	public static final String findProductNamePrice = "SELECT p.name, p.price FROM Product p";
	
	public static final String findGreatPrice = "SELECT p FROM Product p WHERE p.price > :price";
	
	public static final String findGreatLessPrice = "SELECT p FROM Product p WHERE p.price :minUnitPrice AND p.price < :maxUnitPrice";
	
	public static final String findBetweenPrice = "SELECT p FROM Product p WHERE p.price BETWEEN :minUnitPrice and :maxUnitPrice";
	
	public static final String findLikeProductName = "SELECT p FROM Product p WHERE p.name LIKE :productName";
	
	public static final String findInCategoryName = "SELECT p FROM Product p LEFT JOIN p.category c WHERE c.name IN(:categoryName1, :categoryName2)";
	
	public static final String findAllProduct = "SELECT p FROM Product p WHERE p.price > ALL(SELECT p2.price FROM Product p2 WHERE p2.category.categoryId= :categoryId)";
	
	public static final String findFunctionsPrice = "SELECT AVG(p.price), SUM(p.price), MAX(p.price), MIN(p.price), COUNT(p) FROM Product p";
	
	public static final String findGroupByCategory = "SELECT p.category.categoryName, AVG(p.price) FROM Product p GROUP BY p.category.categoryName";
	
	public static final String findGroupByHavingCategory = "SELECT p.category.categoryName, AVG(p.price) FROM Product p GROUP BY p.category.categoryName HAVING AVG(p.price) > :price";
	
	public static final String findOrderByPrice = "SELECT p FROM Product p ORDER BY p.price DESC";

}
