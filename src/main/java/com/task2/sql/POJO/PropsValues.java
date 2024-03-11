package com.task2.sql.POJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class PropsValues{
	
	@Autowired
	private Environment env;
	
	@Value("${spring.datasource.username}") 
	private String username;

	public String getPassword() {
		return env.getProperty("spring.datasource.password");
	}

	public String getUsername() {
		return username;
	}	
}