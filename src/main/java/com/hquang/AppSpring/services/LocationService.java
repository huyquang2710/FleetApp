package com.hquang.AppSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquang.AppSpring.models.Location;
import com.hquang.AppSpring.repositories.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> findAll() {
		return locationRepository.findAll();
	}
	public void save(Location location) {
		locationRepository.save(location);
	}
	public Optional<Location> update(int id) {
		return locationRepository.findById(id);
	}
	public void delete(int id) {
		locationRepository.deleteById(id);
	}
	public Optional<Location> findById(int id) {
		return locationRepository.findById(id);
	}
	
}
