package com.grocerymanagementsystem.repository;

//importing packages
import org.springframework.data.jpa.repository.JpaRepository;

import com.grocerymanagementsystem.entity.Product;

/*
@ Program: creating interface repository class
code by : Krushikesh
Date : 16 December 2022
*/


public interface ProductRepository extends JpaRepository<Product,String > 
{
	Product findByProductName(String name);
	
}
