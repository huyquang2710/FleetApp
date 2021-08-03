package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.EmployeeType;
import com.hquang.AppSpring.repositories.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {
	@Autowired
	EmployeeTypeRepository repository;
	
	//Return List add counties
	public List<EmployeeType> getFindAllEmployeeTypes() {
		return repository.findAll();
	}
	
	//Save a employeeType
	public void save(EmployeeType employeeType) {
		repository.save(employeeType);
	}
	
	//Get by ID
	public Optional<EmployeeType> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
