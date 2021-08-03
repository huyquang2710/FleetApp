package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Employee;
import com.hquang.AppSpring.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	//Return List add counties
	public List<Employee> getFindAllEmployees() {
		return repository.findAll();
	}
	
	//Save a employee
	public void save(Employee employee) {
		repository.save(employee);
	}
	
	//Get by ID
	public Optional<Employee> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
