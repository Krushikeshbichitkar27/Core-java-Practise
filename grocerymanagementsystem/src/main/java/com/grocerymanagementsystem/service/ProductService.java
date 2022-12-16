package com.grocerymanagementsystem.service;

//importing packages
import java.util.List;

import com.grocerymanagementsystem.entity.Product;

/*
@ Program: creating interface service class
code by : Krushikesh
Date : 16 December 2022
*/


public interface ProductService
{
	 List<Product> findAll();
	    Product findProductById(String id);
	    void createProduct(Product p);
	    void deleteProductById(String id);
	    Boolean isProductExist(String name);
		Product findByName(String name);
		void updateProduct(Product p);

	
}
