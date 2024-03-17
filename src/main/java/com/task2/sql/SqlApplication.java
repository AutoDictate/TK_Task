package com.task2.sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.task2.sql.Repository")
public class SqlApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SqlApplication.class, args);
	}
    
}
