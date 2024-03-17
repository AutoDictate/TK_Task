package com.task2.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task2.sql.EmployeeEntity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
