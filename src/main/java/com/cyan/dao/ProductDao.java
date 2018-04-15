package com.cyan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cyan.entity.Product;
import com.cyan.repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	private ProductRepository productRepository;
	
	public Long count() {
		return productRepository.count();
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public void save(Product product) {
		productRepository.save(product);
	}
	
	public void delete(Integer productId) {
		productRepository.deleteById(productId);
	}
	
	public Product getProduct(Integer productId) {
		return productRepository.findById(productId).get();
	}
}
