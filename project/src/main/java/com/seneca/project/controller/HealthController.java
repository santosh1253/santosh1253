package com.seneca.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seneca.project.Dto.HealthDto;
import com.seneca.project.Dto.HealthRequestDto;
import com.seneca.project.Dto.HealthResponseDto;
import com.seneca.project.entity.HealthHistory;
import com.seneca.project.service.HealthService;

@RestController
@RequestMapping("/healthRecord")
public class HealthController {

	@Autowired
	private HealthService healthService;

	@PostMapping
	public ResponseEntity<HealthResponseDto> save(@RequestBody HealthRequestDto healthrequest) {
		HealthResponseDto healthDto = healthService.save(healthrequest);
		return ResponseEntity.ok(healthDto);
	}

	@GetMapping("/fetchHealthData/{id}")
	public List<HealthDto> findData(@PathVariable int id) {
		List<HealthHistory> records = healthService.getAll(id);
		List<HealthDto> response = new ArrayList<>();
		records.forEach(u -> {
			HealthDto healthDto = new HealthDto(u.isRecovered(), u.getIssue(), u.getDate());
			response.add(healthDto);
		});
		return response;
	}

	@PutMapping("/{healthId}")
	public ResponseEntity<String> updateHistory(@PathVariable int healthId, @RequestBody HealthHistory healthHistory) {
		return ResponseEntity.ok(healthService.update(healthId, healthHistory));
	}
}
