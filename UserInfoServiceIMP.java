package com.laptopshop.work.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laptopshop.work.entity.UserInfo;
import com.laptopshop.work.repository.UserInfoRepo;
@Service

public class UserInfoServiceIMP implements UserInfoService{
	private UserInfoRepo userInfoRepo;
	
	public UserInfoServiceIMP(UserInfoRepo userInfoRepo) {
		super();
		this.userInfoRepo = userInfoRepo;
	}

	@Override
	public UserInfo addUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoRepo.save(userInfo);
	}

	@Override
	public UserInfo getuserInfoById(long userId) {
		// TODO Auto-generated method stub
		return userInfoRepo.findById(userId).get();
	}

	@Override
	public UserInfo updateUserInfoById(long userId, UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoRepo.save(userInfo);
	}

	@Override
	public UserInfo getUserInfoByEmail(String userEmail) {
		// TODO Auto-generated method stub
		return userInfoRepo.findUserByEmail(userEmail);
	}

	@Override
	public List<UserInfo> getAllUserByLaptopId(long laptopId) {
		// TODO Auto-generated method stub
		return userInfoRepo.getAllUserByLaptopId(laptopId);
	}


}
