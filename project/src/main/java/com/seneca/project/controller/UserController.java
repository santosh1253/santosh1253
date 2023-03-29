package com.seneca.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seneca.project.Dto.DonationDto;
import com.seneca.project.Dto.UserDto;
import com.seneca.project.entity.User;
import com.seneca.project.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;

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

//	 @GetMapping("/find")
//	public List<DonationDto> findUsers()
//	{
//		return us.findSomeD();
//		
//	}
	//Filter Details of users based on hlth issue and gender
	@GetMapping("/findDetails")
	public List<User> finddata(@RequestParam("grp") String grp,
			@RequestParam(required = false, defaultValue = "male", name = "gen") String gen) {
		System.out.println(grp + " " + gen);
		return us.findSomeData(grp, gen);

	}

	@PutMapping("/validate/{email}/{pwd}")
	public String check(@PathVariable String pwd, @PathVariable String email, User u) {

		System.out.println(pwd);
		if (us.check(u, email, pwd))
			return "Login successful";
		else
			return "Failed to login";

	}

}
