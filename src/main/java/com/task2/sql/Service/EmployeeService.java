package com.task2.sql.Service;

import java.util.List;

import com.task2.sql.DTO.EmployeeDTO;
import com.task2.sql.Entity.EmployeeEntity;


public interface EmployeeService {
	
	EmployeeEntity create(EmployeeEntity employeeEntity);
	List<EmployeeEntity> getAllEmployee();
	List<EmployeeEntity> getNewEmployee(Integer limit);
	EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
}
