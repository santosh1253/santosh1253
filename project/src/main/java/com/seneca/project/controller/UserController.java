package com.seneca.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seneca.project.Dto.UserDto;
import com.seneca.project.entity.User;
import com.seneca.project.repo.UserRepo;
import com.seneca.project.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepo userRepo;

	// Get all users details

	@GetMapping
	private ResponseEntity<List<UserDto>> getAllUsers() {
		return ResponseEntity.ok(userService.getAll());
	}

	// Get user details by id

	@GetMapping("/{id}")
	private User getById(@PathVariable int id) {
		return userService.findUser(id);
	}

	// save user details

	@PostMapping
	public int saveUser(@RequestBody User user) {
		userService.saveDetails(user);
		return user.getId();
	}

	// Update particular user details by Id

	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody User user) {
		userService.updateUserById(id, user);
		return ResponseEntity.ok("User Updated Successfully");
	}

	// Search user details based on bloodGroup and health issue

	@GetMapping("/search")
	public ResponseEntity<List<UserDto>> finddata(@RequestParam("bloodgrp") String bloodGrp,
			@RequestParam(required = false, defaultValue = "fever", name = "issue") String issue) {
		List<UserDto> userDto = userService.findSomeData(bloodGrp, issue);
		return ResponseEntity.ok(userDto);

	}
}
