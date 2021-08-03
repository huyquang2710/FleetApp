package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.VehicleStatus;
import com.hquang.AppSpring.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {
	@Autowired
	VehicleStatusRepository repository;
	
	//Return List add counties
	public List<VehicleStatus> findAll() {
		return repository.findAll();
	}
	
	//Save a vehicleStatus
	public void save(VehicleStatus vehicleStatus) {
		repository.save(vehicleStatus);
	}
	
	//Get by ID
	public Optional<VehicleStatus> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
