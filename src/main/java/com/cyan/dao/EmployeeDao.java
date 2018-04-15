package com.cyan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import com.cyan.entity.Employee;
import com.cyan.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeeByUsername(String username) {
		
		Employee employee = new Employee();
		employee.setUsername(username);
		Example<Employee> example = Example.of(employee);
		return employeeRepository.findAll(example);
	}

}
