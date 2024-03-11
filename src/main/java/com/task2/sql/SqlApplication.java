package com.task2.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task2.sql.CustomerEntity.Customer;
import com.task2.sql.POJO.PropsValues;
import com.task2.sql.Repository.CustomerRepository;

@SpringBootApplication
@RestController
public class SqlApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SqlApplication.class, args);
	}
	// CommandLineRunner Executes First or Before ApplicationRunner
	
	@Autowired
	private PropsValues propsValues;
	
	@GetMapping("/props")		// props -> Properties values
	// To print the value that are in the properties File
    public String printVal() {
            String username = propsValues.getUsername();
            String password = propsValues.getPassword();
            
            return username +"\n"+password;
    }
    
    @Bean 
    public ApplicationRunner applicationRunner(CustomerRepository customerRepository) {
    	return args ->{
    		Customer customer = new Customer(1, "Jaya Surya", "Salem", 21);
    		customerRepository.save(customer);
    	};
    }
}
