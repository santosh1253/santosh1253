package com.seneca.project.Dto;

import java.time.LocalDate;

public class HealthDto {
	private boolean recovered;
	private String issue;
	private LocalDate date;
	
	public HealthDto() {
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

	public HealthDto(boolean recovered, String issue, LocalDate date) {
		super();
		this.recovered = recovered;
		this.issue = issue;
		this.date = date;
	}

	@Override
	public String toString() {
		return "HealthDto [recovered=" + recovered + ", issue=" + issue + ", date=" + date + "]";
	}
	
	

}
