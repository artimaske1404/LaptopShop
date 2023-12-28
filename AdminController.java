package com.laptopshop.work.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.work.entity.AdminDetails;
import com.laptopshop.work.service.AdminService;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	private AdminService service;
	
	public AdminController(AdminService service) {
		super();
		this.service = service;
	}

	@PutMapping("/update")
	public ResponseEntity<AdminDetails> updateAdmin(@RequestBody AdminDetails adminDetails)
	{
		return new ResponseEntity<AdminDetails>(service.updateAdmin(adminDetails),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<AdminDetails> getAdminById(@PathVariable("id") long id)
	{
		return new ResponseEntity<AdminDetails>(service.getAdminId(id),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<AdminDetails>> getAllAdmin()
	{
		return new ResponseEntity<List<AdminDetails>>(service.getAllAdmin(),HttpStatus.OK);
	}
}
