package com.cyan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import com.cyan.entity.Customer;
import com.cyan.repository.CustomerRepository;
import com.cyan.repository.ProductRepository;

@Repository
public class CustomerDao {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Long count() {
		return customerRepository.count();
	}
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	public void save(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void delete(Integer customerId) {
		customerRepository.deleteById(customerId);
	}
	
	public List<Customer> getCustomerByUsername(String username){
		Customer customer = new Customer();
		customer.setUsername(username);
		Example<Customer> example = Example.of(customer);
		return customerRepository.findAll(example);
	}

}
