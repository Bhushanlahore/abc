package com.yash.pms.services.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.exception.ProductFoundException;
import com.yash.pms.model.product.Product;
import com.yash.pms.repository.ProductRepository;
import com.yash.pms.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Product localProduct = this.productRepository.findProductByName(product.getName());
		if(localProduct != null) {
			System.out.println("Product Found!!!");
			throw new ProductFoundException();
		}else {
			
			localProduct = this.productRepository.save(product);
		}
		
		return localProduct;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return this.productRepository.save(product);
	}

	@Override
	public Set<Product> getProducts() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.productRepository.findAll());
	}

	@Override
	public Product getProduct(Long productId) {
		// TODO Auto-generated method stub
		return this.productRepository.findById(productId).get();
	}


	@Override
	public void deleteProduct(Long productId) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setPid(productId);
		
		this.productRepository.delete(product);
		
	}

}
