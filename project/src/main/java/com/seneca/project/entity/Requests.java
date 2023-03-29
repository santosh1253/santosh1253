package com.seneca.project.entity;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Requests {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	int receiverId;
	int donarId;
	LocalDate requestedOn;
	LocalDate donatedOn;
	String location;
	boolean accepted;
	
	public Requests() {}

	public Requests(int id, int receiverId, int donarId, LocalDate requestedOn, LocalDate donatedOn, String location,
			boolean accepted) {
		super();
		this.id = id;
		this.receiverId = receiverId;
		this.donarId = donarId;
		this.requestedOn = requestedOn;
		this.donatedOn = donatedOn;
		this.location = location;
		this.accepted = accepted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public int getDonarId() {
		return donarId;
	}

	public void setDonarId(int donarId) {
		this.donarId = donarId;
	}

	public LocalDate getRequestedOn() {
		return requestedOn;
	}

	public void setRequestedOn(LocalDate requestedOn) {
		this.requestedOn = requestedOn;
	}

	public LocalDate getDonatedOn() {
		return donatedOn;
	}

	public void setDonatedOn(LocalDate donatedOn) {
		this.donatedOn = donatedOn;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	@Override
	public String toString() {
		return "Requests [id=" + id + ", receiverId=" + receiverId + ", donarId=" + donarId + ", requestedOn="
				+ requestedOn + ", donatedOn=" + donatedOn + ", location=" + location + ", accepted=" + accepted + "]";
	}
	
	
}