package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.VehicleMake;
import com.hquang.AppSpring.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	@Autowired
	VehicleMakeRepository repository;
	
	//Return List add counties
	public List<VehicleMake> findAll() {
		return repository.findAll();
	}
	
	//Save a vehicleMake
	public void save(VehicleMake vehicleMake) {
		repository.save(vehicleMake);
	}
	
	//Get by ID
	public Optional<VehicleMake> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
