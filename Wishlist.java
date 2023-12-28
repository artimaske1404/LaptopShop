package com.laptopshop.work.entity;

import javax.persistence.*;
@Entity
public class Wishlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String userEmail;
	@Column
	private long laptopId;
	@Column
	private String imgUrl;
	@Column
	private String productName;
	@Column
	private String price;
	public Wishlist() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public long getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(long laptopId) {
		this.laptopId = laptopId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Wishlist [id=" + id + ", userEmail=" + userEmail + ", laptopId=" + laptopId + ", imgUrl=" + imgUrl
				+ ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
