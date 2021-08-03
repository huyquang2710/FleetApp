package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.VehicleModel;
import com.hquang.AppSpring.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {
	@Autowired
	VehicleModelRepository repository;
	
	//Return List add counties
	public List<VehicleModel> findAll() {
		return repository.findAll();
	}
	
	//Save a vehicleModel
	public void save(VehicleModel vehicleModel) {
		repository.save(vehicleModel);
	}
	
	//Get by ID
	public Optional<VehicleModel> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
