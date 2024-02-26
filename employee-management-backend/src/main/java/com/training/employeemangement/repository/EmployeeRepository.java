package com.training.employeemangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.employeemangement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
