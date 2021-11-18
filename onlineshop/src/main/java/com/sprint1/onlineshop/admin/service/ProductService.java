package com.sprint1.onlineshop.admin.service;

import java.util.List;

import com.sprint1.onlineshop.admin.entity.Product;

public interface ProductService {

	public void addProduct(Product product);

	public Product updateProduct(Product product);

	public List<Product> getAllproduct();

	public Product getProductById(Long productId);

	public void deleteProduct(Long productId);

}
