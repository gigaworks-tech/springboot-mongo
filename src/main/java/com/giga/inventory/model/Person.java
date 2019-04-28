package com.giga.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

	@Id
	private String firstName;
	private String lastName;
	private String age;
	
	public String getFirstNmae() {
		return firstName;
	}
	public void setFirstNmae(String firstNmae) {
		this.firstName = firstNmae;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	 public Person(String firstName, String lastName, String age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }
}
