package com.task2.sql.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Employee")
public class EmployeeEntity {
	
	@Id
	@Column(name ="employee_id")
	private Integer employeeId;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "email")
    private String email;
    
	@Column(name ="age")
	private Integer age;
	
	@Column(name = "phone")
	private Integer phone;
   
	@Column(name = "createdDate")
	private Date createdDate = new Date();
	
	@Column(name= "createdBy")
	private String createdBy;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate = new Date();

	@Column(name = "modifiedBy")
	private String modifiedBy;
	//Constructors
    public EmployeeEntity() {}
    
    public EmployeeEntity(Integer employeeId, String name, String email, Integer age, Integer phone, Date createdDate,
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
