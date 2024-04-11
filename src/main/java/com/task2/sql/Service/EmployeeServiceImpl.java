package com.task2.sql.Service;

import java.util.Date;
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
	
	public List<EmployeeEntity> getNewEmployee(Integer limit) {
		return employeeEntityRepository.newEmployeeList(limit);
	}
	
	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
		EmployeeEntity existingUser = employeeEntityRepository.findById(employeeDTO.getEmployeeId()).get();
		existingUser.setName(employeeDTO.getName());
		existingUser.setAge(employeeDTO.getAge());
		existingUser.setEmail(employeeDTO.getEmail());
		existingUser.setModifiedDate(new Date());
		employeeEntityRepository.save(existingUser);
		EmployeeDTO employee = new EmployeeDTO(
                existingUser.getName(),
                existingUser.getEmail(),
                existingUser.getAge());
        return employee;
	}
}
