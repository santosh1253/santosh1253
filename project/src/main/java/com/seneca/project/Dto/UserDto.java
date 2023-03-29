package com.seneca.project.Dto;

import java.time.LocalDate;

public class UserDto {
	private String email;
	private String gender;
	private String BloodGroup;
	private String issue;
	private boolean recovered;
	private LocalDate donatedDate;
	private LocalDate recievedDate;
	private String loc;
	private boolean isDonated;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public boolean getRecovered() {
		return recovered;
	}
	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}
	public LocalDate getDonatedDate() {
		return donatedDate;
	}
	public void setDonatedDate(LocalDate donatedDate) {
		this.donatedDate = donatedDate;
	}
	public LocalDate getRecievedDate() {
		return recievedDate;
	}
	public void setRecievedDate(LocalDate recievedDate) {
		this.recievedDate = recievedDate;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public boolean getIsDonated() {
		return isDonated;
	}
	public void setIsDonated(boolean isDonated) {
		this.isDonated = isDonated;
	}
	public UserDto(String email, String gender, String bloodGroup, String issue, boolean recovered,
			LocalDate donatedDate, LocalDate recievedDate, String loc, boolean isDonated) {
		super();
		this.email = email;
		this.gender = gender;
		this.BloodGroup = bloodGroup;
		this.issue = issue;
		this.recovered = recovered;
		this.donatedDate = donatedDate;
		this.recievedDate = recievedDate;
		this.loc = loc;
		this.isDonated = isDonated;
	}
	public UserDto() {
		
		// TODO Auto-generated constructor stub
	}
	

}
