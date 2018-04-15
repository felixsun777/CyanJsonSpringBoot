package com.cyan.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cyan.entity.Product;
import com.cyan.entity.Review;
import com.cyan.service.ProductService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;


	@GetMapping("/products")
	public List<Product> ProductService(HttpServletRequest request) {
		return productService.retrieveAllProducts();
	}


	@PostMapping("/insert")
	public void insertProduct(@RequestBody Product product)  {
		productService.insertProduct(product);
	}

	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable Integer productId){
		productService.deleteProduct(productId);
	}

	@PutMapping("/update")
	public void updateProduct(@RequestBody Product product){
		productService.updateProduct(product);
	}
	
	@GetMapping("/review/{productId}")
	public List<Review> ProductReviewPage(@PathVariable Integer productId) {
		return productService.retrieveProductReviews(productId);
	}

}
