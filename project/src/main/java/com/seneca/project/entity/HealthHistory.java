package com.seneca.project.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class HealthHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int healthId;
	@ManyToOne
	private User user;
	private LocalDate date;
	private String issue;
	private boolean recovered;

	

	public HealthHistory(User user, LocalDate date, String issue, boolean recovered) {
		super();
		//this.healthId = healthId;
		this.user = user;
		this.date = date;
		this.issue = issue;
		this.recovered = recovered;
	}
 


	public int getHealthId() {
		return healthId;
	}



	public void setHealthId(int healthId) {
		this.healthId = healthId;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



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



	public HealthHistory() {
		super();
		// TODO Auto-generated constructor stub
	}





}
