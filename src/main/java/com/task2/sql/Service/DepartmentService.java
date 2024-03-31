package com.task2.sql.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task2.sql.Entity.Department;
import com.task2.sql.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	public Department create(Department department) {
		return departmentRepository.save(department);
	}
}
