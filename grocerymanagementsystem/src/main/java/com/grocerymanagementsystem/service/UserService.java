package com.grocerymanagementsystem.service;

//importing packages
import java.util.List;

import com.grocerymanagementsystem.entity.User;

/*
@ Program: creating service class
code by : Swapnil
Date : 16 December 2022
*/

public interface UserService 
{
	 List<User> findAll();
	   void deleteUser(String id);
	   void updateUser(User u);
	   void createUser(User u);
	   Boolean isLogin(User u);
	   User findByEmail(String email);
	   Boolean isUserExist(User u);

}
