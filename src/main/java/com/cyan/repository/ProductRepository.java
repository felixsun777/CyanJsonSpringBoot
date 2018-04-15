package com.cyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyan.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
