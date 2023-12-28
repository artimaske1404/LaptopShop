package com.laptopshop.work.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.laptopshop.work.entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop,Long>{
	
	@Query(value="select*from laptop where laptop_id=:id",nativeQuery = true)
    public Laptop getLaptopsByLaptopId(@Param("id") long laptopId);
	
	@Query(value="select distinct laptop_id from order",nativeQuery = true)
    public Long[] getAllLaptopId();
	
	//@Query(value="select * from laptop where laptop_name like :serch%",nativeQuery = true)
	//public List<Laptop> getAllLaptopBySearch(@Param("search") String laptopName);
}
