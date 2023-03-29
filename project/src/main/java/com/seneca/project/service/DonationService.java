package com.seneca.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seneca.project.entity.DonationHistory;
import com.seneca.project.repo.DonationRepo;

@Service
public class DonationService {

	@Autowired
	private DonationRepo dr;
	
	public void save(DonationHistory dh)
	{
		dr.save(dh);
	}
}
