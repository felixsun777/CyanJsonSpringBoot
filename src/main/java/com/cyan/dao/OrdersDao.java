package com.cyan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cyan.entity.Customer;
import com.cyan.entity.Orders;
import com.cyan.repository.OrderRepository;
import com.cyan.repository.ProductRepository;

@Repository
public class OrdersDao {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Long count() {
		return orderRepository.count();
	}
	
	public List<Orders> getAllOrders(){
		return orderRepository.findAll();
	}
	
	public void save(Orders order) {
		orderRepository.save(order);
	}
	
	public void delete(Integer orderId) {
		orderRepository.deleteById(orderId);
	}
	
	public Orders getOrder(Integer orderId) {
		return orderRepository.findById(orderId).get();
	}

}
