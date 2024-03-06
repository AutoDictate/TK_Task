package com.task2.sql.Repository;

import org.springframework.data.repository.CrudRepository;

import com.task2.sql.CustomerEntity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
}