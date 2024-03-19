package com.task2.sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.task2.sql.Config.DBconfig;
import com.task2.sql.Service.DataImportService;

@SpringBootApplication
@EnableJpaRepositories("com.task2.sql.Repository")
public class SqlApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SqlApplication.class, args);
		
		DBconfig db = context.getBean(DBconfig.class);
		db.dbConnection();
		
		context.getBean(DataImportService.class);	}
    
}
