package com.sprint1.onlineshop.admindao;

import org.springframework.data.repository.CrudRepository;

import com.sprint1.onlineshop.adminentity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
