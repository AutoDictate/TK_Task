package com.task2.sql.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.task2.sql.CustomerEntity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("SELECT e FROM Customer e WHERE e.customer_address = :address")
	List<Customer> findCustomersFromSalem(String address);
	
}