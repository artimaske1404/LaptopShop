package com.laptopshop.work.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.laptopshop.work.entity.UserEntity;


public interface UserRepo extends JpaRepository<UserEntity, String> 
{
	@Query(value="select user_password from user where user_name=:name",nativeQuery = true)
     public String findUserPassword(@Param("name") String userName);
	
	@Query(value="select*from user where user_email=:email",nativeQuery = true)
    public UserEntity getUserByEmail(@Param("email") String userName);
	
//	@Query(value="update collage set user_password=:password where user_email=:email",nativeQuery = true)
//	public UserEntity updatePassword(@Param("email") String userEmail,@Param("password") String userPassword);
}	