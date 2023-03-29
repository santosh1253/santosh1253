package com.seneca.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seneca.project.Dto.HealthDto;
import com.seneca.project.entity.HealthHistory;
import com.seneca.project.service.HealthService;

@RestController
public class HealthController {
	String x="Hello";
	@Autowired
	private HealthService hs;

	@PostMapping("/health/save")
	public void saving(@RequestBody HealthHistory h) {
		hs.saveDetails(h);
	}

	
	@GetMapping("/hello")
	public String display()
	{
		return x;
	}
    @GetMapping("/helloUser")
    public String welcome(@RequestParam("username") String uname)
    {
    	return x+" "+uname;
    }
    @GetMapping("/hUser/{uname}")
    public String hello(@PathVariable String uname)
    {
    	return x+" "+uname;
    }
	@GetMapping("/getHealthrecords/{uid}")
	public ResponseEntity<List<HealthHistory>> getHealth(@PathVariable int uid) {
        return ResponseEntity.ok().body(hs.getById(uid));

	}

	@GetMapping("/getByStatus/{str}")
	public ResponseEntity<List<HealthHistory>> getStatus(@PathVariable Boolean str) {
		return new ResponseEntity<>(hs.getByStatus(str), HttpStatus.OK);
	}
	
	@GetMapping("/healthStatus")
	public ResponseEntity<List<HealthDto>> healthStatus(@RequestParam("uid") int uid)
	{
		return new ResponseEntity<>(hs.getHealthStatus(uid),HttpStatus.OK);
	}
	}
