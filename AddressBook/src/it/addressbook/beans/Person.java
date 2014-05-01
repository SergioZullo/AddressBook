package it.addressbook.beans;

import java.util.Date;

public class Person {
	private String name;
	private String surname;
	private String sex;
	private Date dateOfBirth;
	
	
	public Person() {
		
	}
	
	public Person(String name, String surname, String sex, Date dateOfBirth) {
		super();
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", sex=" + sex
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
