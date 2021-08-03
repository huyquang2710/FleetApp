package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.JobTitle;
import com.hquang.AppSpring.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired
	JobTitleRepository repository;
	
	//Return List add counties
	public List<JobTitle> findAll() {
		return repository.findAll();
	}
	
	//Save a jobTitle
	public void save(JobTitle jobTitle) {
		repository.save(jobTitle);
	}
	
	//Get by ID
	public Optional<JobTitle> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
