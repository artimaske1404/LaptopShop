package com.laptopshop.work.service;

import java.util.List;

import com.laptopshop.work.entity.LaptopOrder;

public interface OrderService {
	//addBuyProduct
	public LaptopOrder addOrder(LaptopOrder laptopOrder);
	
	//getBuyProductById
	public LaptopOrder getOrderById(long id);
	
	//deleteBuyProductById
	public String deleteOrderById(long id);
	
	//getBuyProductByEmail
	public List<LaptopOrder> getOrderByEmail(String userEmail);
	
	//getBuyProductByProductId
	public List<LaptopOrder> getOrdertByLaptopId(long laptopId);
	
}
