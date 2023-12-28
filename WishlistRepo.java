package com.laptopshop.work.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.laptopshop.work.entity.Wishlist;

public interface WishlistRepo extends JpaRepository<Wishlist, Long>{
	

	@Query(value="select*from wishlist where user_email=:email",nativeQuery = true)
	public List<Wishlist> getWishlistByEmail(@Param("email") String email);
}
