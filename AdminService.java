package com.laptopshop.work.service;

import java.util.List;

import com.laptopshop.work.entity.AdminDetails;

public interface AdminService {
	//update admin
	public AdminDetails updateAdmin(AdminDetails adminDetails);
	
	//getAdminById
	public AdminDetails getAdminId(long id);
	
	//getAllAdminInfo
	public List<AdminDetails> getAllAdmin();
}
