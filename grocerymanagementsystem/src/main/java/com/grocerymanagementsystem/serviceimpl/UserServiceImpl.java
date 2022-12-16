package com.grocerymanagementsystem.serviceimpl;
//importing packages
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.grocerymanagementsystem.entity.User;
import com.grocerymanagementsystem.repository.UserRepository;
import com.grocerymanagementsystem.service.UserService;


/*
@ Program: creating serviceimpl class
code by : Swapnil
Date : 16 December 2022
*/

public class UserServiceImpl  implements UserService
{
	 @Autowired
	 UserRepository userRepository;

	@Override
	public List<User> findAll() 
	{
		// TODO Auto-generated method stub
		return userRepository.findAll ();
	}

	@Override
	public void deleteUser(String id) 
	{
		// TODO Auto-generated method stub
		 userRepository.deleteById (id);
	}

	@Override
	public void updateUser(User u) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createUser(User u) 
	{
		// TODO Auto-generated method stub
		 userRepository.save (u);
	}

	@Override
	public Boolean isLogin(User u)
	{
		// TODO Auto-generated method stub
        return true;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail (email);
	}

	@Override
	public Boolean isUserExist(User u)
	{
		return null;
		// TODO Auto-generated method stub
		/* User user = userRepository.findByEmail (u.getEmail());
	        if(user!=null) {
	            throw new RuntimeException ("Email Exist..");
	        }else {
	            return true;
	        }
	        */
	}
	

}
