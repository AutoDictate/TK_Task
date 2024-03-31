package com.task2.sql.Service;

import java.util.List;

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
	
	public List<Department> getAllDepartment(){
		return departmentRepository.findAll();
	}
	
	public Department getDepartmentById(Integer id) {
		return departmentRepository.findById(id).get();
	}
}
