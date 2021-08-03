package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.VehicleMovement;
import com.hquang.AppSpring.repositories.VehicleMovementRepository;

@Service
public class VehicleMovementService {
	@Autowired
	VehicleMovementRepository repository;
	
	//Return List add counties
	public List<VehicleMovement> getFindAllVehicleMovements() {
		return repository.findAll();
	}
	
	//Save a vehicleMovement
	public void save(VehicleMovement vehicleMovement) {
		repository.save(vehicleMovement);
	}
	
	//Get by ID
	public Optional<VehicleMovement> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
