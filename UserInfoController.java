package com.laptopshop.work.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.laptopshop.work.entity.UserInfo;
import com.laptopshop.work.service.UserInfoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
	private UserInfoService userInfoService;
	
	public UserInfoController(UserInfoService userInfoService) 
	{
		super();
		this.userInfoService = userInfoService;
	}

	@PostMapping
	public ResponseEntity<UserInfo> addUserInfo(@RequestBody UserInfo userInfo)
	{
		return new ResponseEntity<UserInfo>(userInfoService.addUserInfo(userInfo),HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<UserInfo> updateUserInfoById(@PathVariable("id") long userId,@RequestBody UserInfo userInfo)
	{
		return new ResponseEntity<UserInfo>(userInfoService.updateUserInfoById(userId, userInfo),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserInfo> getUserInfoById(@PathVariable("id") long userId)
	{
		return new ResponseEntity<UserInfo>(userInfoService.getuserInfoById(userId),HttpStatus.OK);
	}

	@GetMapping("/email/{userEmail}")
	public ResponseEntity<UserInfo> getUserInfoByEmail(@PathVariable("userEmail") String userEmail)
	{
		return new ResponseEntity<UserInfo>(userInfoService.getUserInfoByEmail(userEmail),HttpStatus.OK);
	}
	
	@GetMapping("/getAllUser/{id}")
	public ResponseEntity<List<UserInfo>> getAllUserByLaptopId(@PathVariable("id") long laptopId) 
	{
		return new ResponseEntity<List<UserInfo>>(userInfoService.getAllUserByLaptopId(laptopId),HttpStatus.OK);
	}
}
