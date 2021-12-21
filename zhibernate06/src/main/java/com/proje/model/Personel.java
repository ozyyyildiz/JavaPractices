package com.proje.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Personel {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personelId;
	
	private String firstName;
	
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@ElementCollection
	@CollectionTable(name="personel_phoneNumbers", joinColumns = @JoinColumn(name="personelId"))
	@Column(name="phoneNumber")
	private List<String> phoneNums = new ArrayList<String>();
	
	public Personel() {
		
	}

	public Personel(String firstName, String lastName, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	public void addPhoneNumber(String phoneNumber) {
		this.phoneNums.add(phoneNumber);
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<String> getPhoneNums() {
		return phoneNums;
	}

	public void setPhoneNums(List<String> phoneNums) {
		this.phoneNums = phoneNums;
	}
	
	

}
