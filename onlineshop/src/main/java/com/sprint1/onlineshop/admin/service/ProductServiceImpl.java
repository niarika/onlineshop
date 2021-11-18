package com.sprint1.onlineshop.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprint1.onlineshop.admin.dao.ProductRepository;
import com.sprint1.onlineshop.admin.entity.Product;
import com.sprint1.onlineshop.admin.exception.ProductNotFoundException;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public void addProduct(Product product) {
		repository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		Optional<Product> productDb = this.repository.findById(product.getId());

		if (productDb.isPresent()) {
			Product productUpdate = productDb.get();
			productUpdate.setId(product.getId());
			productUpdate.setName(product.getName());
			productUpdate.setPrice(product.getPrice());
			return productUpdate;
		} else {
			throw new ProductNotFoundException(ProductServiceConstants.PRODUCT_NOT_FOUND_BY_ID + product.getId());
		}
	}

	@Override
	public List<Product> getAllproduct() {
		return (List<Product>) this.repository.findAll();
	}

	@Override
	public Product getProductById(Long productId) {
		Optional<Product> productDb = this.repository.findById(productId);
		if (productDb.isPresent()) {
			return productDb.get();
		} else {
			throw new ProductNotFoundException(ProductServiceConstants.PRODUCT_NOT_FOUND_BY_ID + productId);
		}
	}

	@Override
	public void deleteProduct(Long productId) {
		Optional<Product> productDb = this.repository.findById(productId);
		if (productDb.isPresent()) {
			this.repository.delete(productDb.get());
		} else {
			throw new ProductNotFoundException(ProductServiceConstants.PRODUCT_NOT_FOUND_BY_ID + productId);
		}
	}

}
