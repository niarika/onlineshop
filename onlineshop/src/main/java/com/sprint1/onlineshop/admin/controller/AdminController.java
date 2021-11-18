package com.sprint1.onlineshop.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.onlineshop.admin.entity.Product;
import com.sprint1.onlineshop.admin.service.ProductService;

@RestController
public class AdminController {
	@Autowired
	private ProductService service;

	@GetMapping("/admin")
	public List<Product> getAllproduct() {

		return service.getAllproduct();
	}

	@PostMapping("/admin/add")
	public String addProduct(@RequestBody Product product) {
		service.addProduct(product);
		return "product added successfully";
	}

	@PostMapping("/admin/update/{productId}")
	public String updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
		return "product updated successfully";
	}

	@DeleteMapping("/admin/delete/{productId}")
	public String deleteProduct(@PathVariable(required = true) Long productId) {
		service.deleteProduct(productId);
		return "product deleted successfully";
	}

}
