package com.laptopshop.work.service;

import com.laptopshop.work.entity.UserEntity;

public interface UserService {
	//addUser(for register)
		public UserEntity addStudentData(UserEntity userEntity);
		
//		getUserById
		public UserEntity getUserById(String userName);
		
		//login
		public boolean loginDemo(String userName,String password);
		
		//getUserByEmail
		public UserEntity getUserByEmail(String userEmail);
		
		//updatePassword
		public UserEntity updatePassword(String email,UserEntity userEntity);
		
}
