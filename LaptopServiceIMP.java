package com.laptopshop.work.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.laptopshop.work.entity.Laptop;
import com.laptopshop.work.exception.ResourceNotFoundException;
import com.laptopshop.work.repository.LaptopRepo;

@Service
public class LaptopServiceIMP implements LaptopService 
{
	Long[] laptopId;
	private LaptopRepo laptopRepo;
	public LaptopServiceIMP(LaptopRepo laptopRepo)
	{
		super();
		this.laptopRepo = laptopRepo;
	}
	@Override
	public Laptop addLaptop(Laptop laptop) 
	{
		return laptopRepo.save(laptop);
	}
	@Override
	public List<Laptop> getAllLaptop() 
	{	
		return laptopRepo.findAll();
	}
	@Override
	public Laptop updateLaptopById(long laptopId, Laptop laptop) 
	{	
		laptopRepo.findById(laptopId).orElseThrow(()->new ResourceNotFoundException("ProductSerialNo",laptopId));
		return laptopRepo.save(laptop);
	}
	@Override
	public String deleteLaptopById(long laptopId) 
	{
		laptopRepo.deleteById(laptopId);	
		return "Record Deleted SucessFully";
	}
	@Override
	public Laptop getLaptopById(long laptopId) 
	{	
		return laptopRepo.findById(laptopId).get();
	}
	@Override
	public List<Laptop> getAllLaptopByiId() 
	{
		List<Laptop> LaptopList=new ArrayList<Laptop>();
		for(int i=0;i<laptopId.length;i++)
		{
			LaptopList.add(laptopRepo.getLaptopsByLaptopId(laptopId[i]));
		}
		return LaptopList;
	}
	
	@Override
	public Long[] getAllLaptopId()
	{	
		
		return this.laptopId=laptopRepo.getAllLaptopId(); 
	}

//	@Override
	//public List<Laptop> getAllLaptopBySearch(String laptopName) {
		
		//return laptopRepo.getAllLaptopBySearch(laptopName);
	}
	
	

