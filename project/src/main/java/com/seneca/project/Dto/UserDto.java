package com.seneca.project.Dto;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class UserDto {
	private String first_name;
	private String last_name;
	private String email;
	private String dateOfBirth;
	private String gender;
	private String contactno;
	private String Address;
	private String BloodGroup;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(String first_name, String last_name, String email, String dateOfBirth, String gender,
			String contactno, String address, String bloodGroup) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactno = contactno;
		Address = address;
		BloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "UserDto [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", contactno=" + contactno + ", Address=" + Address
				+ ", BloodGroup=" + BloodGroup + "]";
	}
	
	
	
	

}
