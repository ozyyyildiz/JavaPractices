package com.proje.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

@Component
public class UserSendMailPublisher {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void userRegisterMail() {
		String title = "Kayýt onay";
		String content = "Kaydýnýzý tamamlamak için aþaðýdaki linke týklayýnýz.";
		User user = new User("ozyyyildiz@gmail", "ozanozan", "Ozan", "Yýldýz");
		
		UserSendMailEvent event = new UserSendMailEvent(user, title, content);
		
		applicationEventPublisher.publishEvent(event);
	}
	

}
