package com.laptopshop.work.controller;

import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.laptopshop.work.entity.Laptop;
import com.laptopshop.work.service.LaptopServiceIMP;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/laptop")
public class LaptopController {
	private LaptopServiceIMP laptopService;
	
	public LaptopController(LaptopServiceIMP laptopService)
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
	public ResponseEntity<Laptop> updateLaptopById(@PathVariable("id")long laptopSerialNo,@RequestBody Laptop laptop)
	{	
		return new ResponseEntity<Laptop>(laptopService.updateLaptopById(laptopSerialNo, laptop),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Laptop>> getAllLaptops()
	{
		return new ResponseEntity<List<Laptop>>(laptopService.getAllLaptop(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Laptop> getLaptopById(@PathVariable("id") long laptopSerialNo)
	{
		return new ResponseEntity<Laptop>(laptopService.getLaptopById(laptopSerialNo),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteLaptopById(@PathVariable("id") long laptopSerialNo)
	{
		return new ResponseEntity<String>(laptopService.deleteLaptopById(laptopSerialNo),HttpStatus.OK);
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
