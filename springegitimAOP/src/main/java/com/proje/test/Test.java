package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.model.Product;
import com.proje.repository.ProductRepo;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ProductRepo productRepo = appContext.getBean("productRepo", ProductRepo.class);
		
		Product product = new Product("iPhone xsMaxProHDREditionPlusS",99999, 2, "TELEFON(AMA DÖLAR)");
		
		productRepo.saveProduct(product);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*");
		
		Product find = productRepo.findProduct(0);
		
		System.out.println(find);
		
		appContext.close();

	}

}
