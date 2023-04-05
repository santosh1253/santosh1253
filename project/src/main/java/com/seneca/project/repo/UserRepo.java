package com.seneca.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.seneca.project.Dto.UserDto;
import com.seneca.project.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{


	User findByEmail(String email);
   
	
	@Query("Select u from User u where u.id=?1")
	User find(int id);
	
//	@Query("select new com.seneca.project.Dto.UserDto(u.email, u.gender, u.BloodGroup, h.issue) from User u join HealthHistory h on u.id=h.uid")
//	List<UserDto> findSome();
//Bidirectional Mapping @OneToMany and @ManyToOne
	@Query(nativeQuery = true,value= "select u.* from user u join health_records as uh on u.id=uh.user_id  where u.gender=?1 and uh.issue=?2 ")
	List<User> findSomeDetails(String gen,String issue);
//	
//	@Query("select new com.seneca.project.Dto.DonationDto(u.email, u.gender, u.BloodGroup,h.recovered,h.issue,h.effectedDate)) from  "
//			+ "User u join HealthHistory h on u.id=h.uid")
//	List<DonationDto> findSome();
	
	
	
	
	

}
