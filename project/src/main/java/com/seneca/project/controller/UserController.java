package com.seneca.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seneca.project.Dto.UserDto;
import com.seneca.project.entity.User;
import com.seneca.project.repo.UserRepo;
import com.seneca.project.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;
	@Autowired
	UserRepo ur;

	// Get all users details
	@GetMapping("/users")
	private List<User> getAllUsers() {
		return us.getAll();
	}

	// Get user details by id
	@GetMapping("/get/{id}")
	private User getById(@PathVariable int id) {
		return us.getById(id);
	}

	// save user details
	@PostMapping("/user/saveUser")
	public int saveUser(@RequestBody User u) {
		System.out.println(u.toString());
		us.saveOrupdate(u);
		return u.getId();
	}

	// Update a particular user by Id
	@PutMapping("/update/{id}")
	public User update(@PathVariable int id, @RequestBody User u) {
		us.updateUserById(id, u);
		return u;
	}

	// Delete a user by ID
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		us.delete(id);
	}

	// Find user by id
	@GetMapping("/find/{id}")
	public User findUsers(@PathVariable int id) {
		return us.findUser(id);

	}

	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody User user) {
		User existingUser = ur.findByEmail(user.getEmail());
		System.out.println(user);
		System.out.println(existingUser);
		if (existingUser != null) {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(user.getPassword(), existingUser.getPassword())) {
				return ResponseEntity.status(HttpStatus.OK).body("Login successful");
			}
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
	}

//	 @GetMapping("/find")
//	public List<UserDto> findUsers()
//	{
//		return us.findSomeD();
//		
//	}
	// Filter Details of users based on health issue and gender
	@GetMapping("/findDetails")
	public List<UserDto> finddata(@RequestParam("grp") String grp,@RequestParam(required = false, defaultValue = "male", name = "gen") String gen) 
	{
		List<User> users = us.findSomeData(grp, gen);
		System.out.println(grp + " " + gen);
		List<UserDto> response = new ArrayList<>();
		users.forEach(u -> {
			UserDto userdto = new UserDto(u.getFirst_name(), u.getLast_name(), u.getAddress(), u.getBloodGroup(),
					u.getDateOfBirth(), u.getContactno(), u.getEmail(), u.getGender());
			response.add(userdto);
		});
		return response;

	}
}
