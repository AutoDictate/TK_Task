package com.task2.sql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 		// Represents a Table in a database
@Data  		// By using this, we don't have to write getters and setters
@Table(name ="Customer") 		// it represents declaring the table name
public class Customer{
	
	@Id		// this annotation represents the PRIMARY KEY of the Table
	@Column(name ="id")
	private int customer_id;
	
	@Column(name ="name")
	private String customer_name;
	
	@Column(name ="address")
	private String customer_address;
	
	@Column(name ="age")
	private int customer_age;
}