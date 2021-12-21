package com.proje.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	
	//@Before(value = "execution(public void com.proje.repository.ProductRepo.saveProduct(*))")
	//@Before(value = "execution(public void com.proje.repository.*.saveProduct(*))")
	//@Before(value = "execution(public * saveProduct(*))")
	//@Before(value = "execution(* saveProduct(*))")
	
	
	@Before("pointCutPropductRepo()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Ürün ekleniyor...");
	}
	
	
	
	@After("pointCutPropductRepo()")
	public void before2Advice(JoinPoint joinPoint) {
		System.out.println("Ürün Eklenme iþlemi bitti...");
	}
	
	/*
	 * @Pointcut("execution(public void com.proje.repository.ProductRepo.saveProduct(*))"
	 * ) public void pointCutSaveProduct() {
	 * 
	 * }
	 */
	
	//@Pointcut("within (com.proje.repository.ProductRepo)")
	//@Pointcut("within (com.proje.repository.*)")
	//@Pointcut("within (com.proje.*.ProductRepo)")
	
	
	@Pointcut("within (com.proje..*)")
	public void pointCutPropductRepo() {
		
	}

}
