package com.task2.sql.POJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class PropsValues{
	
	@Autowired
	private Environment environment;									// Environmental Property

    public String getPassword() {
        return environment.getProperty("spring.datasource.password");
    }

    public String getUsername() {
        return environment.getProperty("spring.datasource.username");
    }
}