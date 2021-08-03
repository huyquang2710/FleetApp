package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Vehicle;
import com.hquang.AppSpring.repositories.VehicleRepository;

@Service
public class VehicleService {
	@Autowired
	VehicleRepository repository;
	
	//Return List add counties
	public List<Vehicle> getFindAllVehicles() {
		return repository.findAll();
	}
	
	//Save a vehicle
	public void save(Vehicle vehicle) {
		repository.save(vehicle);
	}
	
	//Get by ID
	public Optional<Vehicle> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
