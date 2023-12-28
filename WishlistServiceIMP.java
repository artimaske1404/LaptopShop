package com.laptopshop.work.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laptopshop.work.entity.Wishlist;
import com.laptopshop.work.repository.WishlistRepo;

@Service
public class WishlistServiceIMP implements WishlistService{

	private WishlistRepo repository;	
	public WishlistServiceIMP(WishlistRepo repository) {
		super();
	}

	@Override
	public Wishlist addWishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		return repository.save(wishlist);
	}

	@Override
	public List<Wishlist> getAllWishlistByEmail(String email) {
		// TODO Auto-generated method stub
		return repository.getWishlistByEmail(email);
	}

	@Override
	public Wishlist getWishlistById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteWishlistById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
}
