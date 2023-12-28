package com.laptopshop.work.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.work.entity.Laptop;
import com.laptopshop.work.service.LaptopServiceIMP;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/buyLaptop")
public class OrderController  {
	private LaptopServiceIMP laptopService;
	
	public OrderController(LaptopServiceIMP laptopService)
	{
		super();
		this.laptopService = laptopService;
	}

	@PostMapping("/add")
	public ResponseEntity<Laptop> addLaptops(@RequestBody Laptop laptop)
	{
		return new ResponseEntity<Laptop>(laptopService.addLaptop(laptop),HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Laptop> updateLaptopById(@PathVariable("id")long productSerialNo,@RequestBody Laptop laptop)
	{	
		return new ResponseEntity<Laptop>(laptopService.updateLaptopById(productSerialNo, laptop),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Laptop>> getAllLaptops()
	{
		return new ResponseEntity<List<Laptop>>(laptopService.getAllLaptop(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Laptop> getLaptopById(@PathVariable("id") long productSerialNo)
	{
		return new ResponseEntity<Laptop>(laptopService.getLaptopById(productSerialNo),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteLaptopById(@PathVariable("id") long productSerialNo)
	{
		return new ResponseEntity<String>(laptopService.deleteLaptopById(productSerialNo),HttpStatus.OK);
	}
	
	@GetMapping("/getAllLaptopById")
	public ResponseEntity<List<Laptop>> getAllLaptopByiId() 
	{
		return  new ResponseEntity<List<Laptop>>(laptopService.getAllLaptopByiId(),HttpStatus.OK);
	}
	
	@GetMapping("/getAllLaptopId")
	public ResponseEntity<Long[]> getAllLaptopId()
	{	
		
		return new ResponseEntity<Long[]>(laptopService.getAllLaptopId(),HttpStatus.OK);
		//return null;
	}

	/*@GetMapping("/search/{name}")
	public ResponseEntity<List<Laptop>> getAllLaptopBySearch(@PathVariable("name")String laptopName)
	{
		return new ResponseEntity<List<Laptop>>(laptopService.getAllLaptopBySearch(laptopName),HttpStatus.OK);
	}*/
}
