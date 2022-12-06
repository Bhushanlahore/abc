package com.yash.pms.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.pms.model.product.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	//find Product by name
	public Product findProductByName(String name);

	
}
