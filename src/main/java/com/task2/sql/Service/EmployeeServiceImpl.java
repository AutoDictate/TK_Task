package com.task2.sql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task2.sql.DTO.EmployeeDTO;
import com.task2.sql.Entity.EmployeeEntity;
import com.task2.sql.Repository.EmployeeEntityRepository;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeEntityRepository employeeEntityRepository;
	
	public EmployeeEntity create(EmployeeEntity employee) {
		return employeeEntityRepository.save(employee);
	}
	public List<EmployeeEntity> getAllEmployee() {
		return employeeEntityRepository.findAll();
	}

	public EmployeeEntity getEmployeeById(Integer id) {
		return employeeEntityRepository.findById(id).get();
	}
	
	public EmployeeEntity update(EmployeeEntity employee) {
		return employeeEntityRepository.save(employee);
	}
}
