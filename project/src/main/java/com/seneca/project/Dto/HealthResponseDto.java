package com.seneca.project.Dto;

import java.time.LocalDate;

public class HealthResponseDto {
	
	private int healthId;
	private boolean recovered;
	private String issue;
	private LocalDate date;
	public int getHealthId() {
		return healthId;
	}
	public void setHealthId(int healthId) {
		this.healthId = healthId;
	}
	public boolean isRecovered() {
		return recovered;
	}
	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public HealthResponseDto(int healthId, boolean recovered, String issue, LocalDate date) {
		super();
		this.healthId = healthId;
		this.recovered = recovered;
		this.issue = issue;
		this.date = date;
	}
	public HealthResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HealthResponseDto [healthId=" + healthId + ", recovered=" + recovered + ", issue=" + issue + ", date="
				+ date + "]";
	}
	
	

}
