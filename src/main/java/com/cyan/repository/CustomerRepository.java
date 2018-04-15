package com.cyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyan.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
