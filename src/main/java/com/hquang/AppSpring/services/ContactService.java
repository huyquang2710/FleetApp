package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Contact;
import com.hquang.AppSpring.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	ContactRepository repository;
	
	//Return List add counties
	public List<Contact> findAll() {
		return repository.findAll();
	}
	
	//Save a contact
	public void save(Contact contact) {
		repository.save(contact);
	}
	
	//Get by ID
	public Optional<Contact> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
