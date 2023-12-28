package com.laptopshop.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.work.entity.UserEntity;
import com.laptopshop.work.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController
{
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}


	@PostMapping("/add")
	public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity)
	{
		
		return new ResponseEntity<UserEntity>(this.userService.addStudentData( userEntity),HttpStatus.CREATED);
	}
	
	@GetMapping("/{userName}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable("userName") String userName)
	{
		return new ResponseEntity<UserEntity>(userService.getUserById(userName),HttpStatus.OK);
	}

	//loginConfiguration
	@GetMapping("/{userName}/{password}")
	public ResponseEntity<Boolean> findUserPasswordById(@PathVariable("userName")String userName,@PathVariable("password")String userPassword)
	{
		return new ResponseEntity<Boolean>(userService.loginDemo(userName, userPassword),HttpStatus.OK);
	}
	
	@GetMapping("/email/{email}")
	public ResponseEntity<UserEntity> getUserByEmail(@PathVariable("email") String userEmail) 
	{
		return new ResponseEntity<UserEntity>(userService.getUserByEmail(userEmail),HttpStatus.OK);
	}
	
	@PostMapping("/forgetPassword/{email}")
	public ResponseEntity<UserEntity> updatePassword(@PathVariable("email") String email, @RequestBody UserEntity userEntity)
	{
		return new ResponseEntity<UserEntity>(userService.updatePassword(email,userEntity),HttpStatus.OK);
	}
	
}
