package com.cyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyan.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
