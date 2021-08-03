package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.VehicleMaintenance;
import com.hquang.AppSpring.repositories.VehicleMaintenanceRepository;

@Service
public class VehicleMaintenanceService {
	@Autowired
	VehicleMaintenanceRepository repository;
	
	//Return List add counties
	public List<VehicleMaintenance> findAll() {
		return repository.findAll();
	}
	
	//Save a vehicleMaintenance
	public void save(VehicleMaintenance vehicleMaintenance) {
		repository.save(vehicleMaintenance);
	}
	
	//Get by ID
	public Optional<VehicleMaintenance> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
