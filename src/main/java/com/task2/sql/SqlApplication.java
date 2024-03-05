package com.task2.sql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner printVal(PropsValues propsValues) {
        return args ->{
            String username = propsValues.getUsername();
            System.out.println("Username: " + username);
        };
    }
}
