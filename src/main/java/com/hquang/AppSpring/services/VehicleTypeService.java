package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.VehicleType;
import com.hquang.AppSpring.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {
	@Autowired
	VehicleTypeRepository repository;
	
	//Return List add counties
	public List<VehicleType> findAll() {
		return repository.findAll();
	}
	
	//Save a vehicleType
	public void save(VehicleType vehicleType) {
		repository.save(vehicleType);
	}
	
	//Get by ID
	public Optional<VehicleType> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
