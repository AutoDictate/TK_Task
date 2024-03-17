package com.task2.sql.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task2.sql.Repository.DepartmentRepository;
import com.task2.sql.Repository.EmployeeRepository;

import com.task2.sql.EmployeeEntity.Department;
import com.task2.sql.EmployeeEntity.Employee;
import jakarta.annotation.PostConstruct;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostConstruct
	public void Dbinitialize() {
		Department department1 = new Department( 1,"Java Tech Stack","TK");
		departmentRepository.save(department1);
	
		Employee employee1 = new Employee(1,"Jayasurya","jayasurya@gmail.com",department1);
		employeeRepository.save(employee1);
	}
}
