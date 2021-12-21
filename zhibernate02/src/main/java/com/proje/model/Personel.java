package com.proje.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pörsýnýl")
public class Personel {
	
	@Id
	@Column(name="id")
	private int personelId;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthOfDate;
	
	private String personelNumber;
	
	private double salary;

	public Personel() {
	}

	public Personel(int personelId, String firstName, String lastName, Date birthOfDate, String personelNumber, double salary) {
		this.personelId = personelId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.personelNumber = personelNumber;
		this.salary = salary;
	}

	public int getId() {
		return personelId;
	}

	public void setId(int id) {
		this.personelId = id;
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

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getPersonelNumber() {
		return personelNumber;
	}

	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Personel [id=" + personelId + ", firstName=" + firstName + ", lastName=" + lastName + ", birthOfDate="
				+ birthOfDate + ", personelNumber=" + personelNumber + ", salary=" + salary + "]";
	}
	
}
