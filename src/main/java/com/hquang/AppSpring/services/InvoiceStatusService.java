package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.InvoiceStatus;
import com.hquang.AppSpring.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	@Autowired
	InvoiceStatusRepository repository;
	
	//Return List add counties
	public List<InvoiceStatus> getFindAllInvoiceStatuses() {
		return repository.findAll();
	}
	
	//Save a invoiceStatus
	public void save(InvoiceStatus invoiceStatus) {
		repository.save(invoiceStatus);
	}
	
	//Get by ID
	public Optional<InvoiceStatus> findById(int id) {
		return repository.findById(id);
	}
	//Delete
	public void delete(int id) {
		repository.deleteById(id);
	}

}
