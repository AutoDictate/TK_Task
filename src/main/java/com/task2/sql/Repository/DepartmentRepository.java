package com.task2.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task2.sql.EmployeeEntity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
