package com.seneca.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seneca.project.Dto.HealthRequestDto;
import com.seneca.project.Dto.HealthResponseDto;
import com.seneca.project.entity.HealthHistory;
import com.seneca.project.entity.User;
import com.seneca.project.repo.HealthRepo;
import com.seneca.project.repo.UserRepo;

@Service
public class HealthService {

	@Autowired
	private UserRepo userrepo;
	@Autowired
	private HealthRepo healthRepo;

	public HealthResponseDto save(HealthRequestDto h) {
		User user=userrepo.find(h.getUser_id());
		HealthHistory healthrecord = healthRepo.save(new HealthHistory(user,h.getDate(),h.getIssue(),h.isRecovered()));
		HealthResponseDto healthresponse=new HealthResponseDto(healthrecord.getHealthId(),healthrecord.isRecovered(),healthrecord.getIssue(),healthrecord.getDate());
		return healthresponse;
		
	}
	
	public String update(int healthId,HealthHistory updated)
	{
		HealthHistory healthHistory = healthRepo.findById(healthId).orElseThrow(() -> new RuntimeException("user Not found"));
		healthHistory.setIssue(updated.getIssue());
		healthHistory.setDate(updated.getDate());
		healthHistory.setRecovered(updated.isRecovered());
		healthRepo.save(healthHistory);
		return "Updated Details Successfully";
		
	}

	public List<HealthHistory> getAll(int id) {
		return healthRepo.findRecords(id);
	}

}
