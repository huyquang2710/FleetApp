package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Client;
import com.hquang.AppSpring.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository repository;

	// Return List add clients
	public List<Client> findAll() {
		return repository.findAll();
	}

	// Save a client
	public void save(Client client) {
		repository.save(client);
	}

	// Get by ID
	public Optional<Client> findById(int id) {
		return repository.findById(id);
	}

	// Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
