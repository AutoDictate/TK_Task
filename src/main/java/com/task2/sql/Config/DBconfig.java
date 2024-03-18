package com.task2.sql.Config;

import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class DBconfig {
	
	@Autowired
	private Environment env;

	public void dbConnection() {
		try {
			DriverManager.getConnection(
				env.getProperty("spring.datasource.url"),
				env.getProperty("spring.datasource.username"),
				env.getProperty("spring.datasource.password")
			);
			System.out.println("Database Successfully Connected..!!!");
		} catch(Exception e) {
			System.out.println("Database Connection Failed..!!!");
			e.printStackTrace();
		}
	}
}
