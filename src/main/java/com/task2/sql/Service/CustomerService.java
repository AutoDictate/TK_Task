	package com.task2.sql.Service;
	
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;
	
	import com.task2.sql.CustomerEntity.Customer;
	import com.task2.sql.Repository.CustomerRepository;
	
	@Component
	public class CustomerService implements CommandLineRunner{
		
		@Autowired					// by using this we don't want to manually instantiate the customerRepository
		private CustomerRepository customerRepository;
		
		@Override
		public void run(String... args) throws Exception {
			
	        List<Customer> customers = customerRepository.findCustomersFromSalem("Salem");
	
	        // Print the result to the console
	        System.out.println("Customers from Salem:");
	        for (Customer customer : customers) {
	            System.out.println("Customer ID: " + customer.getCustomer_id());
	            System.out.println("Customer Name: " + customer.getCustomer_name());
	            System.out.println("Customer Address: " + customer.getCustomer_address());
	            System.out.println("Customer Age: " + customer.getCustomer_age());
	            System.out.println();
	        }
	    }
	}