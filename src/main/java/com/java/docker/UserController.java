package com.java.docker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.docker.beans.User;
import com.java.docker.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/user/create")
	public User createUser(@RequestBody User user) {

		userRepository.save(user);
		return user;
	}

	@GetMapping("/user/all")
	public List<User> GetAllUser() {

		return userRepository.findAll();
	}

}
