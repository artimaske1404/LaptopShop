package com.laptopshop.work.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptopshop.work.entity.UserEntity;
import com.laptopshop.work.repository.UserRepo;
@Service
public class UserServiceIMP implements UserService {
	
	@Autowired
	private UserRepo userRepository;
	
	
	public UserServiceIMP(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserEntity addStudentData(UserEntity userEntity) 
	{	
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity getUserById(String userName) 
	{	
		return userRepository.findById(userName).get();
	}

	@Override
	public boolean loginDemo(String userName, String userPassword)
	{
		boolean result;
		
		if(userRepository.existsById(userName))
		{
			String password = userRepository.findUserPassword(userName);
			if(password.equals(userPassword))
			{
				result=true;
			}
			else
			{
				result=false;
				
			}
		}
		else
		{
			result=false;
			
			
		}
		
		return result;
	}

	@Override
	public UserEntity getUserByEmail(String userEmail) 
	{
	
		return userRepository.getUserByEmail(userEmail);
	}

	@Override
	public UserEntity updatePassword(String email,UserEntity userEntity) 
	{
		return userRepository.save(userEntity);
	}

	
}
