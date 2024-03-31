package com.task2.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task2.sql.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
