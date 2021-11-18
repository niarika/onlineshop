package com.sprint1.onlineshop.adminservice;

import java.util.List;

import com.sprint1.onlineshop.adminentity.Product;

public interface ProductService {

	Product addProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllproduct();

	Product getProductById(long productId);

	void deleteProduct(long productId);

}
