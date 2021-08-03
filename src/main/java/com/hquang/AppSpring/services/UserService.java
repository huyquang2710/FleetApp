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
	
	//Return List add counties
	public List<User> getFindAllUsers() {
		return repository.findAll();
	}
	
	//Save a user
	public void save(User user) {
		repository.save(user);
	}
	
	//Get by ID
	public Optional<User> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
