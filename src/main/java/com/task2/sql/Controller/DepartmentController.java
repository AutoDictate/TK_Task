package com.task2.sql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task2.sql.Entity.Department;
import com.task2.sql.Entity.Employee;
import com.task2.sql.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/store")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.create(department);
	}
	
	@GetMapping("/getDepartment")
	public List<Department> getDepatments(){
		return departmentService.getAllDepartment();
	} 
	
	@GetMapping("/{id}")
	public Department getDepatment(@PathVariable Integer id) {
		return departmentService.getDepartmentById(id);
	}
}
