	package com.task2.sql.Service;
	
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.task2.sql.CustomerEntity.Customer;
import com.task2.sql.Repository.CustomerRepository;
	
@Component
@RestController
public class CustomerService{
	
	@Autowired					// by using this we don't want to manually instantiate the customerRepository
	private CustomerRepository customerRepository;
	
	@GetMapping("/details")
	public String CustomerDetails(){
		
        List<Customer> customers = customerRepository.findCustomersFromSalem("Salem");
        StringBuilder response = new StringBuilder();
        for (Customer customer : customers) {
            response.append("Customer ID: ").append(customer.getCustomer_id()).append("\n");
            response.append("Customer Name: ").append(customer.getCustomer_name()).append("\n");
            response.append("Customer Address: ").append(customer.getCustomer_address()).append("\n");
            response.append("Customer Age: ").append(customer.getCustomer_age()).append("\n\n");
        }
        return response.toString();
    }
}