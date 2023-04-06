package com.seneca.project.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	@OneToMany(mappedBy = "user")
	private List<HealthHistory> hr;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	private String dateOfBirth;
	
	private String gender;
	
	private String contactNo;
	
	private String address;
	
	private String bloodGroup;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfisrtName(String fisrtName) {
		this.firstName = fisrtName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getcontactNo() {
		return contactNo;
	}

	public void setcontactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getbloodGroup() {
		return bloodGroup;
	}

	public void setbloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String fisrtName, String lastName, String email, String password, String dateOfBirth,
			String gender, String contactNo, String address, String bloodGroup) {
		super();
		this.id = id;
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactNo = contactNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", fisrtName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", contactNo="
				+ contactNo + ", address=" + address + ", bloodGroup=" + bloodGroup + "]";
	}

}