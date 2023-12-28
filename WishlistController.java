package com.laptopshop.work.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.work.entity.Wishlist;
import com.laptopshop.work.service.WishlistService;

@CrossOrigin("*")
@RestController
@RequestMapping("/wishlist")
public class WishlistController {
	private WishlistService service;
	
	public WishlistController(WishlistService service) {
		super();
		this.service = service;
	}


	@PostMapping("add")
	public ResponseEntity<Wishlist> addWishlist(@RequestBody Wishlist wishlist) 
	{
		return new ResponseEntity<Wishlist>(service.addWishlist(wishlist),HttpStatus.CREATED);
	}

	@GetMapping("/email/{email}")
	public ResponseEntity<List<Wishlist>> getAllWishlistByEmail(@PathVariable("email") String email)
	{
		
		return new ResponseEntity<List<Wishlist>>(service.getAllWishlistByEmail(email),HttpStatus.OK);
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Wishlist> getWishlistById(@PathVariable("id") long id) 
	{
	
		return new ResponseEntity<Wishlist>(service.getWishlistById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deleteWishlistById(@PathVariable("id") long id) 
	{
	
		service.deleteWishlistById(id);
	}
}
