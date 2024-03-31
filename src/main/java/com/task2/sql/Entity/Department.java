package com.task2.sql.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="Department")
public class Department {
	@Id
	@Column(name="department_id")
    private Integer departmentId;
	@Column(name="name")
    private String name;
	@Column(name="location")
    private String location;
	
	// Constructor
	public Department() {}
	
	public Department(Integer departmentId, String name, String location) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.location = location;
	}
	
	// Getter and Setters
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
