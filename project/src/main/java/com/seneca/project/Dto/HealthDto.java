package com.seneca.project.Dto;

import java.time.LocalDate;

public class HealthDto {
	private boolean recovered;
	private String issue;
	private LocalDate effectedDate;
	
	public HealthDto() {
	}
	public HealthDto(boolean recovered, String issue, LocalDate effectedDate) {
		super();
		this.recovered = recovered;
		this.issue = issue;
		this.effectedDate = effectedDate;
	}

	public boolean getRecovered() {
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
	public LocalDate getEffectedDate() {
		return effectedDate;
	}
	public void setEffectedDate(LocalDate effectedDate) {
		this.effectedDate = effectedDate;
	}
	@Override
	public String toString() {
		return "HealthDto [recovered=" + recovered + ", issue=" + issue + ", effectedDate=" + effectedDate + "]";
	}
	

}
