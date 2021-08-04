package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.User;
import com.hquang.AppSpring.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	@Autowired
	BCryptPasswordEncoder encoder;

	
	//Save a user
	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		repository.save(user);
	}

}
