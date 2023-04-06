package com.seneca.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.seneca.project.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{


   
	
	@Query("Select u from User u where u.id=?1")
	User find(int id);
	

    //Bidirectional Mapping @OneToMany and @ManyToOne
	@Query(nativeQuery = true,value= "select u.* from users u join health_history as uh on u.id=uh.user_id  where u.blood_group=?1 and uh.issue=?2 ")
	List<User> findSomeDetails(String bloodgroup,String issue);

	
	
	
	

}
