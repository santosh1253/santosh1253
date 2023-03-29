package com.seneca.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.seneca.project.Dto.DonationDto;
import com.seneca.project.Dto.UserDto;
import com.seneca.project.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{


	User findByEmail(String email);
   
	
	@Query("Select u from User u where u.id=?1")
	User find(int id);
	
//	@Query("select new com.seneca.project.Dto.UserDto(u.email, u.gender, u.BloodGroup, h.issue) from User u join HealthHistory h on u.id=h.uid")
//	List<UserDto> findSome();

	@Query("select new com.seneca.project.Dto.UserDto(u.email, u.gender, u.BloodGroup, h.issue,h.recovered,d.donatedDate,d.recievedDate,d.loc,d.isDonated) "
			+ "from User u join HealthHistory h on u.id=h.uid join DonationHistory d on h.uid=d.uid where h.issue=?1 and u.gender=?2 ")
	List<UserDto> findSomeDetails(String issue,String gen);
	
	@Query("select new com.seneca.project.Dto.DonationDto(u.email, u.gender, u.BloodGroup,new com.seneca.project.Dto.HealthDto(h.recovered,h.issue,h.effectedDate)) from  "
			+ "User u join HealthHistory h on u.id=h.uid")
	List<DonationDto> findSome();
	
	
	

}
