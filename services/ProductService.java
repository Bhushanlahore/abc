package com.yash.pms.services;

import java.util.Set;
import com.yash.pms.model.product.Product;


public interface ProductService {

	public Product addProduct(Product product) throws Exception;
	
	public Product updateProduct(Product product);
	
	public Set<Product> getProducts();
	
	public Product getProduct(Long productId);
	
	public  void deleteProduct(Long productId);
	
}
