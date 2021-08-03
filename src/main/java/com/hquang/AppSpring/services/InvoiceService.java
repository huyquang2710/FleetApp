package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Invoice;
import com.hquang.AppSpring.repositories.InvoiceRepository;

@Service
public class InvoiceService {
	@Autowired
	InvoiceRepository repository;
	
	//Return List add counties
	public List<Invoice> findAll() {
		return repository.findAll();
	}
	
	//Save a invoice
	public void save(Invoice invoice) {
		repository.save(invoice);
	}
	
	//Get by ID
	public Optional<Invoice> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
