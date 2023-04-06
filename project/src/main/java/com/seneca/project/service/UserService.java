package com.seneca.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seneca.project.Dto.UserDto;
import com.seneca.project.entity.User;
import com.seneca.project.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	// save details of a user
	public void saveDetails(User u) {
		userRepo.save(u);
	}

	public List<UserDto> getAll() {
		List<User> users = userRepo.findAll();
		List<UserDto> response = new ArrayList<>();
		users.forEach(u -> {
			UserDto userDto = new UserDto(u.getfirstName(), u.getlastName(), u.getEmail(), u.getDateOfBirth(),
					u.getGender(), u.getcontactNo(), u.getaddress(), u.getbloodGroup());
			response.add(userDto);
		});
		return response;
	}


	public void updateUserById(int id, User updated) {

		User u = userRepo.findById(id).orElseThrow(() -> new RuntimeException("user Not found"));
		u.setfisrtName(updated.getfirstName());
		u.setlastName(updated.getlastName());
		u.setDateOfBirth(updated.getDateOfBirth());
		u.setaddress(updated.getaddress());
		u.setGender(updated.getGender());
		u.setEmail(updated.getEmail());
		u.setcontactNo(updated.getcontactNo());
		u.setbloodGroup(updated.getbloodGroup());
		u.setPassword(updated.getPassword());
		userRepo.save(u);
	}

	public User findUser(int id) {

		return userRepo.find(id);

	}

	// returns a UserDto
	public List<UserDto> findSomeData(String bloodGrp, String issue) {

		List<User> users = userRepo.findSomeDetails(bloodGrp, issue);
		List<UserDto> response = new ArrayList<>();
		users.forEach(u -> {
			UserDto userDto = new UserDto(u.getfirstName(), u.getlastName(), u.getEmail(), u.getDateOfBirth(),
					u.getGender(), u.getcontactNo(), u.getaddress(), u.getbloodGroup());
			response.add(userDto);
		});
		return response;
	}

}
