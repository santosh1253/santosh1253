package com.seneca.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seneca.project.Dto.HealthDto;
import com.seneca.project.entity.HealthHistory;
import com.seneca.project.repo.HealthRepo;


@Service
public class HealthService {

	@Autowired
	private HealthRepo hr;
	public void saveDetails(HealthHistory h)
	{
		hr.save(h);
	}
	public List<HealthHistory> getById(int uid)
	{
		List<HealthHistory> l=hr.findByUid(uid);
		return  l;	
	}
	public List<HealthHistory> getByStatus(Boolean x)
	{
		List<HealthHistory> li=hr.findByrecovered(x);
		return li;
		
	}
	public List<HealthDto> getHealthStatus(int x)
	{
	   return hr.findHealthDetails(x);
	}
}
