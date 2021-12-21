package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	
	private String phoneNum;
	
	private String email;
	
	private String link;

	public Contact() {
		
	}

	public Contact(String phoneNum, String email, String link) {
		this.phoneNum = phoneNum;
		this.email = email;
		this.link = link;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
