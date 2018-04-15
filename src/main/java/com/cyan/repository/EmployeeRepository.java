package com.cyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyan.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
