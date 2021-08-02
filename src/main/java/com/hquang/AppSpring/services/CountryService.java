package com.hquang.AppSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Country;
import com.hquang.AppSpring.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository repository;
	
	public List<Country> getFindAllCountries() {
		return repository.findAll();
	}

}
