package com.grocerymanagementsystem.entity;


//importing packages
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@ Program: creating entity class
code by : Swapnil
Date : 16 December 2022
*/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user")

public class User
{
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int userId;
	    private String userName;
	    @Column(length = 30)
	    private String FirstName;
	    @Column(length = 30)
	    private String lastName;
	    @Column(length = 30)
	    private String email;
	    @Column(length = 50)
	    private String address;
	    @Column(length = 20)
	    private String password;
		
	  
}
