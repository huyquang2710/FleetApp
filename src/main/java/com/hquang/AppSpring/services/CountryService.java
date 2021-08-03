package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Country;
import com.hquang.AppSpring.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository repository;
	
	//Return List add counties
	public List<Country> getFindAllCountries() {
		return repository.findAll();
	}
	
	//Save a country
	public void save(Country country) {
		repository.save(country);
	}
	
	//Get by ID
	public Optional<Country> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
