package com.laptopshop.work.entity;

import javax.persistence.*;
@Entity
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	@Column
	private String userImgUrl;
	@Column(length = 20)
	private String userFirstName;
	@Column(length = 20)
	private String userLastName;
	@Column(unique=true)
	private String userEmail;
	@Column(length=3)
	private byte userAge;
	@Column(length=10)
	private long ContactNumber;
	@Column
	private String Gender;
	@Column
	private String userCountry;
	@Column
	private String State;
	@Column
	private String District;
	@Column
	private String Address;
	@Column
	private int Pincode;
	public UserInfo() {
		super();
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserImgUrl() {
		return userImgUrl;
	}
	public void setUserImgUrl(String userImgUrl) {
		this.userImgUrl = userImgUrl;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public byte getUserAge() {
		return userAge;
	}
	public void setUserAge(byte userAge) {
		this.userAge = userAge;
	}
	public long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userImgUrl=" + userImgUrl + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userEmail=" + userEmail + ", userAge=" + userAge
				+ ", ContactNumber=" + ContactNumber + ", Gender=" + Gender + ", userCountry=" + userCountry
				+ ", State=" + State + ", District=" + District + ", Address=" + Address + ", Pincode=" + Pincode + "]";
	}
		
}
