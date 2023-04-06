package com.seneca.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.seneca.project.entity.HealthHistory;

public interface HealthRepo extends JpaRepository<HealthHistory,Integer>{
	@Query("Select u from HealthHistory u where u.user.id=?1")
	List<HealthHistory> findRecords(int id);
	
	

}
