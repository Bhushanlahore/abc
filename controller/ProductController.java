package com.yash.pms.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.product.Product;
import com.yash.pms.services.ProductService;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//add product
	@PostMapping("/")
	public ResponseEntity<Product> add(@RequestBody Product product) throws Exception{
		
		return ResponseEntity.ok(this.productService.addProduct(product));
	}

	//update product
	@PutMapping("/")
	public ResponseEntity<Product> update(@RequestBody Product product){
		return ResponseEntity.ok(this.productService.updateProduct(product));
	}
	
	
	
	//get single product
	@GetMapping("/{pId}")
	public Product get(@PathVariable("pId") Long pId) {
		return this.productService.getProduct(pId);
	}
	
	//delete product
	@DeleteMapping("/{pId}")
	public void delete(@PathVariable("pId") Long pId) {
		 this.productService.deleteProduct(pId);
	}
}
