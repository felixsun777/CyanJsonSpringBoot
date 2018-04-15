package com.cyan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cyan.entity.Department;
import com.cyan.repository.DepartmentRepository;

@Repository
public class DepartmentDao {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	}
	
	public void save(Department department) {
		departmentRepository.save(department);
	}
	
	public void delete(Integer departmentId) {
		departmentRepository.deleteById(departmentId);
	}

}
