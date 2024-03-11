package com.task2.sql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.task2.sql.CustomerEntity.Customer;
import com.task2.sql.POJO.PropsValues;
import com.task2.sql.Repository.CustomerRepository;

@SpringBootApplication
public class SqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlApplication.class, args);
	}
	
	//	Note:-
	// CommandLineRunner Executes First or Before ApplicationRunner
	
	@Bean
	// To print the value that are in the properties File
    public CommandLineRunner printVal(PropsValues propsValues) {
        return args ->{
            String username = propsValues.getUsername();
            String password = propsValues.getPassword();
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        };
    }
    
    @Bean 
    public ApplicationRunner applicationRunner(CustomerRepository customerRepository) {
    	return args ->{
    		Customer customer = new Customer(1, "Jaya Surya", "Salem", 21);
    		customerRepository.save(customer);
    	};
    }
}
