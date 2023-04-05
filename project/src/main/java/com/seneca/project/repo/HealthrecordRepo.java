package com.seneca.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.seneca.project.entity.HealthRecords;

public interface HealthrecordRepo extends JpaRepository<HealthRecords,Integer>{
	@Query("Select u from HealthRecords u where u.user.id=?1")
	List<HealthRecords> findRecords(int id);
	
	

}
