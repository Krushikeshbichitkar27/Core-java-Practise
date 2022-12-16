package com.grocerymanagementsystem.entity;

//importing packages
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@ Program: creating entity class
code by : Krushikesh
Date : 16 December 2022
*/


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="product_details")
public class Product
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_name", nullable=false)
	private String productName;
	
	@Column(name="price", nullable = false)
	private int price; 
	
	@Column(nullable=false)
    private String description;
	
	
	
	
	

}
