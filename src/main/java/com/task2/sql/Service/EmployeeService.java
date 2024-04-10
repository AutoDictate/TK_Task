package com.task2.sql.Service;

import java.util.List;

import com.task2.sql.DTO.EmployeeDTO;
import com.task2.sql.Entity.EmployeeEntity;


public interface EmployeeService {
	public EmployeeEntity create(EmployeeEntity employeeEntity);
	public List<EmployeeDTO> getAllEmployee();
	public EmployeeDTO getEmployeeById(Integer id);
	public EmployeeDTO update(EmployeeDTO employee);
	public void delete(Integer id);
}
