package com.task2.sql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="Customer")

public class Customer{
	
	@Id
	@Column(name ="id")
	private int customer_id;
	
	@Column(name ="name")
	private String customer_name;
	
	@Column(name ="address")
	private String customer_address;
	
	@Column(name ="age")
	private int customer_age;
}