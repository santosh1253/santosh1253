package com.seneca.project.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class DonationHistory {

	@JoinColumn(name = "user_id")
	int uid;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	int donationId;

	@Column(name = "first_name")
	String fname;

	@Column(name = "last_name")
	String lname;

	@Column(name = "location")
	String loc;

	@Column
	LocalDate donatedDate;
	
	@Column
	LocalDate recievedDate;
	
	@Column(name = "is_donated")
	boolean isDonated;

	public LocalDate getRecievedDate() {
		return recievedDate;
	}

	public int getDonationId() {
		return donationId;
	}

	public void setDonationId(int donationId) {
		this.donationId = donationId;
	}

	public void setRecievedDate(LocalDate recievedDate) {
		this.recievedDate = recievedDate;
	}

	public DonationHistory() {
		
	}

	public DonationHistory( int donationId, String fname, String lname, String loc, LocalDate donatedDate,
			LocalDate recievedDate, boolean isDonated) {
		super();
		this.donationId = donationId;
		this.fname = fname;
		this.lname = lname;
		this.loc = loc;
		this.donatedDate = donatedDate;
		this.recievedDate = recievedDate;
		this.isDonated = isDonated;
	}
   

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}


	public LocalDate getDonatedDate() {
		return donatedDate;
	}

	public void setDonatedDate(LocalDate donatedDate) {
		this.donatedDate = donatedDate;
	}

	public boolean getIsDonated() {
		return isDonated;
	}

	public void setIsDonated(boolean isDonated) {
		this.isDonated = isDonated;
	}

	@Override
	public String toString() {
		return "DonationHistory [ donationId=" + donationId + ", fname=" + fname + ", lname=" + lname
				+ ", loc=" + loc + ", donatedDate=" + donatedDate + ", recievedDate=" + recievedDate + ", isDonated="
				+ isDonated + "]";
	}

}