package com.seneca.project.Dto;

import java.time.LocalDate;

public class HealthRequestDto {

	private int health_id;
	private LocalDate date;
	private String issue;
	private boolean recovered;
	private int user_id;
	public HealthRequestDto(int health_id, LocalDate date, String issue, boolean recovered, int user_id) {
		super();
		this.health_id = health_id;
		this.date = date;
		this.issue = issue;
		this.recovered = recovered;
		this.user_id = user_id;
	}
	public int getHealth_id() {
		return health_id;
	}
	public void setHealth_id(int health_id) {
		this.health_id = health_id;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public HealthRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HealthRequestDto [health_id=" + health_id + ", date=" + date + ", issue=" + issue + ", recovered="
				+ recovered + ", user_id=" + user_id + "]";
	}
	
}
