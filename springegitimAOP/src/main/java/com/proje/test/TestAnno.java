package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.model.Product;
import com.proje.repository.ProductRepo;

public class TestAnno {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductRepo productRepo = appContext.getBean("productRepo", ProductRepo.class);
		
		Product product = new Product("iPhone xsMaxProHDREditionPlusS",99999, 2, "TELEFON(AMA DÖLAR)");
		
		productRepo.saveProduct(product);
		
		System.out.println("_________________________________");
		
		productRepo.findProducts();
		
		System.out.println("***********************");
		
		productRepo.findProduct(0);
		
		appContext.close();
	}

}
