package com.proje.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

@Component
public class UserSendMailListener implements ApplicationListener<UserSendMailEvent> {

	@Override
	public void onApplicationEvent(UserSendMailEvent event) {
		
		User user = event.getUser();
		
		System.out.println("Mail g�nderilecek adres: ");
		
		System.out.println(user);
		
		System.out.println("Mail ba�l��� : " + event.getTitle());
		System.out.println("Mail ba�l��� : " + event.getContent());
	}
}
