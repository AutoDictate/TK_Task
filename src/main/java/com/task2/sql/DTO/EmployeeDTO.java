package com.task2.sql.DTO;

public class EmployeeDTO {
	
	private Integer employeeId;
	private String name;
	private String email;
	private Integer age;
	
	public EmployeeDTO(String name, String email, Integer age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
