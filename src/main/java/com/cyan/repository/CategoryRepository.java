package com.cyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyan.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
