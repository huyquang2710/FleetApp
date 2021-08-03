package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.VehicleHire;
import com.hquang.AppSpring.repositories.VehicleHireRepository;

@Service
public class VehicleHireService {
	@Autowired
	VehicleHireRepository repository;
	
	//Return List add counties
	public List<VehicleHire> getFindAllVehicleHires() {
		return repository.findAll();
	}
	
	//Save a country
	public void save(VehicleHire country) {
		repository.save(country);
	}
	
	//Get by ID
	public Optional<VehicleHire> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
