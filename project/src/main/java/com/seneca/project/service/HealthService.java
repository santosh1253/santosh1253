package com.seneca.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seneca.project.Dto.HealthRequestDto;
import com.seneca.project.Dto.HealthResponseDto;
import com.seneca.project.entity.HealthRecords;
import com.seneca.project.entity.User;
import com.seneca.project.repo.HealthrecordRepo;
import com.seneca.project.repo.UserRepo;

@Service
public class HealthService {

	@Autowired
	private UserRepo userrepo;
	@Autowired
	private HealthrecordRepo hr;

	public HealthResponseDto save(HealthRequestDto h) {
		User user=userrepo.find(h.getUser_id());
		HealthRecords healthrecord = hr.save(new HealthRecords(user,h.getDate(),h.getIssue(),h.isRecovered()));
		HealthResponseDto healthresponse=new HealthResponseDto(healthrecord.getHealthId(),healthrecord.isRecovered(),healthrecord.getIssue(),healthrecord.getDate());
		return healthresponse;
		
	}

	public List<HealthRecords> getAll(int id) {
		return hr.findRecords(id);
	}

}
