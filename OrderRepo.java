package com.laptopshop.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.laptopshop.work.entity.LaptopOrder;

import java.util.List;

public interface OrderRepo extends JpaRepository<LaptopOrder, Long>
{
	@Query(value="select*from lp_order where user_email=:email",nativeQuery = true)
    public List<LaptopOrder> findAllByEmail(@Param("email") String userEmail);
	
	@Query(value="select*from lp_order where laptop_id=:id",nativeQuery = true)
    public List<LaptopOrder> findAllByLaptopId(@Param("id") long laptopId);
	
	
}

