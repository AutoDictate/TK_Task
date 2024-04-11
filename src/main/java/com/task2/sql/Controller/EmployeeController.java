package com.task2.sql.Controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.task2.sql.DTO.EmployeeDTO;
import com.task2.sql.Entity.EmployeeEntity;
import com.task2.sql.Service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeService;

	@PostMapping("/add")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeEntity employee) {
		employeeService.create(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee saved successfully.");
	}
	
	@GetMapping("/view")
	public List<EmployeeEntity> getEmployees(){
		return employeeService.getAllEmployee();
	} 
	
	@GetMapping("/view/recent/{limit}")
	public List<EmployeeEntity> getNewEmployeeList(@PathVariable("limit") Integer limit){
		return employeeService.getNewEmployee(limit);
	}
	
	@PutMapping("update/{id}")	// Name, Email, Age
	public EmployeeDTO updateEmployee(@PathVariable("id") Integer id
										,@RequestBody EmployeeDTO employeeDTO) {
		employeeDTO.setEmployeeId(id);
		EmployeeDTO updatedEmployee = employeeService.updateEmployee(employeeDTO);
		return updatedEmployee;
	}
	@PostMapping("/add/p1")
	public ResponseEntity<String> saveEmployee(
			@RequestParam(name="empId") Integer empId,
			@RequestParam(name="name") String name,
			@RequestParam(name="email") String email,
			@RequestParam(name="age") Integer age,
			@RequestParam(name="phone") Integer phone,
			@RequestParam(name="createdBy") String createdBy,
			@RequestParam(name="modifiedBy") String modifiedBy)
	{
		EmployeeEntity employee = new EmployeeEntity();
	    employee.setEmployeeId(empId);
	    employee.setName(name);
	    employee.setEmail(email);
	    employee.setAge(age);
	    employee.setPhone(phone);
	    employee.setCreatedBy(createdBy);
	    employee.setModifiedBy(modifiedBy);
	    
	    employee.setCreatedDate(new Date());
	    employee.setModifiedDate(new Date());
	    
	    employeeService.create(employee);
	    return ResponseEntity.status(HttpStatus.CREATED).body("Employee saved successfully.");
	}
	
}
