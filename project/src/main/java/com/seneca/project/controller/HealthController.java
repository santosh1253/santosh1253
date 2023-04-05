package com.seneca.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seneca.project.Dto.HealthDto;
import com.seneca.project.Dto.HealthRequestDto;
import com.seneca.project.Dto.HealthResponseDto;
import com.seneca.project.entity.HealthRecords;
import com.seneca.project.service.HealthService;
@RestController
@RequestMapping("/healthRecord")
public class HealthController {

	@Autowired
	private HealthService hs;
	
	@PostMapping
	public  ResponseEntity<HealthResponseDto> save(@RequestBody HealthRequestDto healthrequest)
	{
		HealthResponseDto hdto=hs.save(healthrequest);
		return ResponseEntity.ok(hdto);
	}
	@GetMapping("/fetchHealthData/{id}")
	public List<HealthDto> finddata(@PathVariable int id) 
	{
		List<HealthRecords> records=hs.getAll(id);
		List<HealthDto> response = new ArrayList<>();
		//System.out.println(records);
		records.forEach(u -> {
			HealthDto htdo=new HealthDto(u.isRecovered(),u.getIssue(),u.getDate());
			response.add(htdo);
		});
		return response;

	}
}
