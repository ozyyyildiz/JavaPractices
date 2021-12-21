package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.publisher.UserSendMailPublisher;

public class Test {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserSendMailPublisher userSendMailPublisher = (UserSendMailPublisher) applicationContext.getBean("userSendMailPublisher");
		
		userSendMailPublisher.userRegisterMail();
		
		applicationContext.close();
	}

}
