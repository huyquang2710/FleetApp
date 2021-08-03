package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.State;
import com.hquang.AppSpring.repositories.StateRepository;

@Service
public class StateService {
	@Autowired
	StateRepository repository;
	
	//Return List add states
	public List<State> getFindAllStates() {
		return repository.findAll();
	}
	
	//Save a state
	public void save(State state) {
		repository.save(state);
	}
	
	//Get by ID
	public Optional<State> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}
}
