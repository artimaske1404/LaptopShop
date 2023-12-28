package com.laptopshop.work.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laptopshop.work.entity.LaptopOrder;
import com.laptopshop.work.repository.OrderRepo;

@Service
public class OrderServiceIMP implements OrderService {

	private OrderRepo repository;
	public OrderServiceIMP(OrderRepo repository) 
	{
		super();
		this.repository = repository;
	}
	@Override
	public LaptopOrder addOrder(LaptopOrder laptopOrder) {
		// TODO Auto-generated method stub
		return repository.save(laptopOrder);
	}

	@Override
	public LaptopOrder getOrderById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public String deleteOrderById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "Record Deleted SuccessFully";
	}

	@Override
	public List<LaptopOrder> getOrderByEmail(String userEmail) {
		// TODO Auto-generated method stub
		return repository.findAllByEmail(userEmail);
	}

	@Override
	public List<LaptopOrder> getOrdertByLaptopId(long laptopId) {
		// TODO Auto-generated method stub
		return repository.findAllByLaptopId(laptopId);
	}

}
