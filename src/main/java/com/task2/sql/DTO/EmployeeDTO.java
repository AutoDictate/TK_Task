package com.task2.sql.DTO;

import java.util.Date;

import org.springframework.stereotype.Component;

public class EmployeeDTO {
	
	private Integer employeeId;
	private String name;
	private String email;
	private Integer age;
	private Integer phone;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
		
	public EmployeeDTO(Integer employeeId, String name, String email, Integer age, Integer phone, Date createdDate,
			String createdBy, Date modifiedDate, String modifiedBy) {
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
}
