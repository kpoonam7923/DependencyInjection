package com.di.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//this will make as spring bean for Person class's 
@Component
//@Scope(value="prototype") // when we use prototype, it will create instance for u and now two object will be created, by default it is singleton
public class Person {

	private int id;
	private String name;
	
	@Autowired // search by type
	@Qualifier("address") //search by name
	private Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void show() {
		System.out.println("Show method");
		address.print();
	}
	
	public Person() {
		super();
		System.out.println("Object created");
	}
}
