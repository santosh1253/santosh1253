package com.seneca.project.Dto;

public class UserDto {
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String gender;
	private String contactNo;
	private String address;
	private String bloodGroup;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public UserDto(String firstName, String lastName, String email, String dateOfBirth, String gender, String contactNo,
			String address, String bloodGroup) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactNo = contactNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", contactNo=" + contactNo + ", address=" + address
				+ ", bloodGroup=" + bloodGroup + "]";
	}

}
