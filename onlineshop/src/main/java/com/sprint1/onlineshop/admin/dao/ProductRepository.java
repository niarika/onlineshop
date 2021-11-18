package com.sprint1.onlineshop.admin.dao;

import org.springframework.data.repository.CrudRepository;

import com.sprint1.onlineshop.admin.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
