package com.grocerymanagementsystem.serviceimpl;


//importing packages
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerymanagementsystem.entity.Product;
import com.grocerymanagementsystem.repository.ProductRepository;
import com.grocerymanagementsystem.service.ProductService;

/*
@ Program: creating  service impl  class
code by : Krushikesh
Date : 16 December 2022
*/

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll ();
	}

	@Override
	public Product findProductById(String id) {
		// TODO Auto-generated method stub
		return productRepository.findById (id).get ();
	}

	@Override
	public void createProduct(Product p) 
	{
		// TODO Auto-generated method stub
		productRepository.save (p);
	}

	@Override
	public void updateProduct(Product p) 
	{
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductById(String id) 
	{
		// TODO Auto-generated method stub
		 productRepository.deleteById (id);
	}

	@Override
	public Product findByName(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByProductName (name);
	}

	@Override
	public Boolean isProductExist(String name) {
		// TODO Auto-generated method stub
		 Product p = productRepository.findByProductName (name);
	        if(p==null) return true;
	        throw new RuntimeException ("Product is Exist..");
	}
	
	

}
