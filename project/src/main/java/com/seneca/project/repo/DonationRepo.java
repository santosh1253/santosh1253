package com.seneca.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seneca.project.entity.DonationHistory;

public interface DonationRepo extends JpaRepository<DonationHistory,Integer>{

}
