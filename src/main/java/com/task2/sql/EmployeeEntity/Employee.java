package com.task2.sql.EmployeeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Employee")
public class Employee {
	
	@Id
	@Column(name ="employee_id")
	private Integer employeeId;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    
    //Constructors
    public Employee() {}
    
    public Employee(Integer employeeId, String name, String email, Department department) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.department = department;
	}
    
    // Getters and Setters 
    
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
