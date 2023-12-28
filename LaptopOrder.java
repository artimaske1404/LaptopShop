package com.laptopshop.work.entity;

import javax.persistence.*;
@Entity
@Table(name ="lp_order")
public class LaptopOrder
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userEmail;
	
	private long laptopId;
	
	private String imgUrl;
	
	private String laptopName;
	
	private String price;
	
	private String paymentMethod;
	
	private long cardNumber;
	
	private String cardownerName;
	
	private String cvv;

	private int month;
	
	private int year;
	
	private String bankName;
	
	private String bankBranch;

	private String accountHolderName;
	
	private long accountNumber;
	
	private String upi;

	private String googlePayUserName;
	
	private String date;
	public LaptopOrder() {
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
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardownerName() {
		return cardownerName;
	}
	public void setCardownerName(String cardownerName) {
		this.cardownerName = cardownerName;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}
	public String getGooglePayUserName() {
		return googlePayUserName;
	}
	public void setGooglePayUserName(String googlePayUserName) {
		this.googlePayUserName = googlePayUserName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userEmail=" + userEmail + ", laptopId=" + laptopId + ", imgUrl=" + imgUrl
				+ ", laptopName=" + laptopName + ", price=" + price + ", paymentMethod=" + paymentMethod
				+ ", cardNumber=" + cardNumber + ", cardownerName=" + cardownerName + ", cvv=" + cvv + ", month="
				+ month + ", year=" + year + ", bankName=" + bankName + ", bankBranch=" + bankBranch
				+ ", accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", upi=" + upi
				+ ", googlePayUserName=" + googlePayUserName + ", date=" + date + "]";
	}
	
}
