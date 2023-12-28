package com.laptopshop.work.service;

import java.util.List;

import com.laptopshop.work.entity.Laptop;

public interface LaptopService {
	
	public Laptop addLaptop(Laptop laptop);
	public List<Laptop> getAllLaptop();
	public Laptop updateLaptopById(long laptopId,Laptop laptop);
	public String deleteLaptopById(long laptopId);
	public Laptop getLaptopById(long laptopID);
	public List<Laptop> getAllLaptopByiId();
	public Long[] getAllLaptopId();
	//public List<Laptop> getAllLaptopBySearch(String LaptopName);;
}
