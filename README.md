# Task 2

## Description
This repository contains the solution for Task 2.

## Task Completed
1. ```mvn clean install``` is used in my ```war``` file. From this,
   
   -> ```clean``` represents it will clean/ delete all the previously compiled Java classes and packages.
   
   ->```install``` represents it will compile and test our Java project. It also copy the .war file in the local maven repository.

2. ```application.properties``` is configured with random values to connect with local MySQL database.

    - -> ```JPA LOMBOK MySQL driver``` Dependencies are used in this Project.
   
   -  -> ```Lombok``` is used to minimize ```Getters and Setters```.
   
    - -> ```JPA``` is used to connect my code with annotations to the database.

   > ```application.properties``` Values Provided :
     - spring.datasource.url  = jdbc:mysql://localhost:3306/customer
     - spring.datasource.username = root
     - spring.datasource.password = ####
     - spring.jpa.show-sql = true
     - spring.jpa.hibernate.ddl-auto = update
     - spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
     - spring.jpa.properties.hibernate.dialect.format_sql = true
     - spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
       
3. Downloaded and Installed ```DBeaver``` Application Sucessfully.
4. ```@Value``` annotation is used to print the values that are in the ```application.properties```.
   - Here, I have created a CommandLineRunner to print the values in the Console after the application is run successfully.
   
# Issues Faced

1. While building Maven project using ```clean install```.
   - You have to provide all the properties in the ```application.properties```.
   - We have included JPA and MySQL dependencies in our project. So, we have to define all the properties before the build.
   - You have to provide Correct ```url, username, password```. Otherwise, it will provide an error:
   - ```Unable to perform query selection```
   - You have to provide the correct dialect of MySQL -> Mine is MySQL8Dialect. I'm using MySQL 8 version.

2. While printing value in the ```application.properties```.
   - ```Lombok``` is not working while printing in the console.
3. While pushing the project to my Repo.
   - ```master``` repo is default in our local repo.
   - You have to change the name of ```master``` into ```main```
   - where you can able to push your code in a ```main``` branch without any difficulties.
