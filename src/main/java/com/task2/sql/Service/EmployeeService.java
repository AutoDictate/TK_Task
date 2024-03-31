package com.task2.sql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task2.sql.Entity.Employee;
import com.task2.sql.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id).get();
	}
	
	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void delete(Integer id) {
		employeeRepository.deleteById(id);
	}
}
