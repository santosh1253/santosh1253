package com.seneca.project.Dto;

import java.time.LocalDate;



public class DonationDto {
	HealthDto hdto;
	private String email;
	private String gender;
	private String BloodGroup;
	private boolean recovered;
	private String issue;
	private LocalDate effectedDate;
	public DonationDto( String email, String gender, String bloodGroup,  boolean recovered,String issue,
			LocalDate effectedDate) {
		super();
		//this.hdto = hdto;
		this.email = email;
		this.gender = gender;
		BloodGroup = bloodGroup;
		this.issue = issue;
		this.recovered = recovered;
		this.effectedDate = effectedDate;
	}
	public DonationDto() {
	}
	public String getEmail() {
		return email;
	}
//	public HealthDto getHdto() {
//		return hdto;
//	}
//	public void setHdto(HealthDto hdto) {
//		this.hdto = hdto;
//	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public boolean isRecovered() {
		return recovered;
	}
	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}
	public LocalDate getEffectedDate() {
		return effectedDate;
	}
	public void setEffectedDate(LocalDate effectedDate) {
		this.effectedDate = effectedDate;
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
	@Override
	public String toString() {
		return "DonationDto [email=" + email + ", gender=" + gender + ", BloodGroup=" + BloodGroup + "]";
	}
	
	

}
