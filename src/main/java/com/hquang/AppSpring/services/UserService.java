package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.User;
import com.hquang.AppSpring.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	
	//Save a user
	public void save(User user) {
		repository.save(user);
	}

}
