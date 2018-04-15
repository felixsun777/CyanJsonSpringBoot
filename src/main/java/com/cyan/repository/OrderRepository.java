package com.cyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyan.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
