package com.task2.sql.CustomerEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 											// Represents a Table in a database
@Table(name ="Customer") 		// it represents declaring the table name
public class Customer{
	
	public Customer(){}
	
	public Customer(int customer_id, String customer_name, String customer_address, int customer_age) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.customer_age = customer_age;
	}

	@Id												// this annotation represents the PRIMARY KEY of the Table
	@GeneratedValue
	@Column(name ="id")
	private int customer_id;
	
	@Column(name ="name")
	private String customer_name;
	
	public int getCustomer_id() {
		return customer_id;
	}
	

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public int getCustomer_age() {
		return customer_age;
	}

	public void setCustomer_age(int customer_age) {
		this.customer_age = customer_age;
	}

	@Column(name ="address")
	private String customer_address;
	
	@Column(name ="age")
	private int customer_age;
}