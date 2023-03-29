package com.seneca.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.seneca.project.Dto.HealthDto;
import com.seneca.project.entity.HealthHistory;

public interface HealthRepo extends JpaRepository<HealthHistory,Integer> {
      List<HealthHistory> findByUid(int uid);

	List<HealthHistory> findByrecovered(Boolean recovered);
	
	@Query("select new com.seneca.project.Dto.HealthDto(hr.recovered,hr.issue,hr.effectedDate) from HealthHistory hr where uid=?1")
	List<HealthDto> findHealthDetails(int uid);
}
