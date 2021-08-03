package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Supplier;
import com.hquang.AppSpring.repositories.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	SupplierRepository repository;
	
	//Return List add counties
	public List<Supplier> getFindAllSuppliers() {
		return repository.findAll();
	}
	
	//Save a supplier
	public void save(Supplier supplier) {
		repository.save(supplier);
	}
	
	//Get by ID
	public Optional<Supplier> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
