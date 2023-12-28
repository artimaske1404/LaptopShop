package com.laptopshop.work.service;

import java.util.List;

import com.laptopshop.work.entity.Wishlist;

public interface WishlistService {
	//add to Favorite
	public Wishlist addWishlist(Wishlist wishlist);
	
	//get All Favorite
	public List<Wishlist> getAllWishlistByEmail(String email);
	
	//getFavoriteById
	public Wishlist getWishlistById(long id);
	
	//delete Favorite
	public void deleteWishlistById(long id);
}
