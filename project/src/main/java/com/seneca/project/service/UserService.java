package com.seneca.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.seneca.project.Dto.DonationDto;
import com.seneca.project.Dto.UserDto;
import com.seneca.project.entity.User;
import com.seneca.project.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	@Autowired
	private PasswordEncoder b;

	@Autowired
	public UserService(UserRepo repo, PasswordEncoder b) {
		this.repo = repo;
		this.b = b;
	}

	public void saveOrupdate(User u) {
		repo.save(u);
	}

	public List<User> getAll() {
		List<User> l = new ArrayList<>();
		repo.findAll().forEach(x -> l.add(x));
		return l;
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

	public User getById(int id) {
		return repo.findById(id).get();

	}

	public void updateUserById(int id, User updated) {

		User u = repo.findById(id).orElseThrow(() -> new RuntimeException("user Not found"));
		u.setFirst_name(updated.getFirst_name());
		u.setLast_name(updated.getLast_name());
		u.setDateOfBirth(updated.getDateOfBirth());
		u.setAddress(updated.getAddress());
		u.setGender(updated.getGender());
		u.setEmail(updated.getEmail());
		u.setContactno(updated.getContactno());
		u.setBloodGroup(updated.getBloodGroup());
		u.setPassword(updated.getPassword());
		repo.save(u);
	}

	public User findUser(int id) {

		return repo.find(id);

	}

//	public List<DonationDto> findSomeD()
//	{
//		return repo.findSome();
//    }
	public List<User> findSomeData(String issue,String gen) {
		return repo.findSomeDetails( gen,issue);
	}

	public boolean check(User u, String email, String password) {
		u = repo.findByEmail(email);
		System.out.println(u.getPassword());
		if (u != null && b.matches(password, u.getPassword()))
			return true;
		return false;

	}

}
