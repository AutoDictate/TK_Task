package com.task2.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task2.sql.Entity.EmployeeEntity;

public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, Integer> {

}
