package com.seneca.project.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class HealthHistory {
	
	@JoinColumn(name="user_id")
	int uid;  
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="effected_date")
	LocalDate effectedDate;
	
	@Column(name="issue")
	String issue;
	
	@Column(name="recovered")
	boolean recovered;
	
	public HealthHistory() {}

	public HealthHistory(int uid, int id, LocalDate effectedDate, String issue, boolean recovered) {
		super();
		this.uid = uid;
		this.id = id;
		this.effectedDate = effectedDate;
		this.issue = issue;
		this.recovered = recovered;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getEffectedDate() {
		return effectedDate;
	}

	public void setEffectedDate(LocalDate effectedDate) {
		this.effectedDate = effectedDate;
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

	@Override
	public String toString() {
		return "HealthHistory [uid=" + uid + ", id=" + id + ", effectedDate=" + effectedDate + ", issue=" + issue
				+ ", recovered=" + recovered + "]";
	}
	
}