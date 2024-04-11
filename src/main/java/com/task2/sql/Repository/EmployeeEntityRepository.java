package com.task2.sql.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.task2.sql.Entity.EmployeeEntity;

public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	@Query(value = "SELECT * FROM EMPLOYEE ORDER BY created_Date DESC LIMIT ?1", nativeQuery = true)
	List<EmployeeEntity>newEmployeeList(Integer limit);

}
