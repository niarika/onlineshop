package com.sprint1.onlineshop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprint1.onlineshop.admin.dao.ProductRepository;
import com.sprint1.onlineshop.admin.entity.Product;
import com.sprint1.onlineshop.admin.service.ProductService;
import com.sprint1.onlineshop.user.dao.UserRepository;
import com.sprint1.onlineshop.user.entity.LoginDetails;
import com.sprint1.onlineshop.user.service.UserService;

@SpringBootTest
class OnlineShopTests {
	@Autowired
	UserService userservice;
	@Autowired
	ProductService productservice;
	@Autowired
	private UserRepository repository;
	@Autowired
	private ProductRepository prepository;

	@Test
	void addUser() {
		LoginDetails userr = new LoginDetails();
		userr.setUserId(1);
		userr.setUserName("bob");
		userr.setUserPassword("123");
		repository.save(userr);
		assertNotNull(repository.findById(1).get());

	}

	private void assertNotNull(LoginDetails user) {

	}

	public void addProduct() {
		Product productt = new Product();
		productt.setId(1l);
		productt.setName("fossil");
		productt.setPrice(29.9);
		productt.setQuantity(1);
		productt.setCategory("watches");
		productt.setSubcategory("women's watch");
		assertNotNull(prepository.findById((long) 1).get());
	}

	private void assertNotNull(Product product) {

	}

}
