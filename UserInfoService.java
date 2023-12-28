package com.laptopshop.work.service;

import java.util.List;

import com.laptopshop.work.entity.UserInfo;


public interface UserInfoService {
	//add user info method
	public UserInfo addUserInfo(UserInfo userInfo);
	
	//get User By Id method
	public UserInfo getuserInfoById(long userId);
	
	//update User Info By Id
	public UserInfo updateUserInfoById(long userId,UserInfo userInfo);
	
	
	//get  User By email
	public UserInfo getUserInfoByEmail(String userEmail);
	
	//getAllUserByProductId
	public List<UserInfo> getAllUserByLaptopId(long laptopId);
	
}
