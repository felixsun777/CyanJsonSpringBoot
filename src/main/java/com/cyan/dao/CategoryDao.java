package com.cyan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cyan.entity.Category;
import com.cyan.entity.Department;
import com.cyan.repository.CategoryRepository;
import com.cyan.repository.CustomerRepository;
import com.cyan.repository.DepartmentRepository;

@Repository
public class CategoryDao {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Long count() {
		return categoryRepository.count();
	}
	
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	public void save(Category category) {
		categoryRepository.save(category);
	}
	
	public void delete(Integer categoryId) {
		categoryRepository.deleteById(categoryId);
	}
}
