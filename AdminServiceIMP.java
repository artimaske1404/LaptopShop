package com.laptopshop.work.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laptopshop.work.entity.AdminDetails;
import com.laptopshop.work.repository.AdminRepo;

@Service
public class AdminServiceIMP implements AdminService{
	private AdminRepo repository;
	
	public AdminServiceIMP(AdminRepo repository) {
		super();
		this.repository = repository;
	}

	@Override
	public AdminDetails updateAdmin (AdminDetails adminDetails) {
		// TODO Auto-generated method stub	
		return repository.save(adminDetails);
	}

	@Override
	public AdminDetails getAdminId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<AdminDetails> getAllAdmin() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
