package com.laptopshop.work.entity;

import javax.persistence.*;
@Entity
public class Laptop 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long laptopId;
	@Column
	private String LaptopImg;
	@Column
	private String partNo;
	@Column
	private String laptopName;
	@Column
	private int model;
	@Column
	private String brand;
	@Column
	private int price;
	@Column
	private int Stock;
	@Column
	private String laptopRating;
	@Column
	private String laptopWarranty;
	public Laptop() {
		super();
	}
	public long getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(long laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopImg() {
		return LaptopImg;
	}
	public void setLaptopImg(String laptopImg) {
		LaptopImg = laptopImg;
	}
	public String getPartNo() {
		return partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getLaptopRating() {
		return laptopRating;
	}
	public void setLaptopRating(String laptopRating) {
		this.laptopRating = laptopRating;
	}
	public String getLaptopWaranty() {
		return laptopWarranty;
	}
	public void setLaptopWaranty(String laptopWaranty) {
		this.laptopWarranty = laptopWaranty;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", LaptopImg=" + LaptopImg + ", partNo=" + partNo + ", laptopName="
				+ laptopName + ", model=" + model + ", brand=" + brand + ", price=" + price + ", Stock=" + Stock
				+ ", laptopRating=" + laptopRating + ", laptopWaranty=" + laptopWarranty + "]";
	}
	
}