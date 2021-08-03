package com.hquang.AppSpring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hquang.AppSpring.models.Country;
import com.hquang.AppSpring.models.Location;
import com.hquang.AppSpring.models.State;
import com.hquang.AppSpring.services.CountryService;
import com.hquang.AppSpring.services.LocationService;
import com.hquang.AppSpring.services.StateService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	@Autowired
	private StateService stateService;
	@Autowired
	private CountryService countryService;

	@GetMapping("/locations")
	public String getLocation(Model model) {
		List<Location> listLocation = locationService.getLocations();
		model.addAttribute("locations", listLocation);

		List<State> listState = stateService.getFindAllStates();
		model.addAttribute("states", listState);

		List<Country> listCountry = countryService.getFindAllCountries();
		model.addAttribute("countries", listCountry);
		
		return "location";
	}

	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping("/locations/findById")
	@ResponseBody
	public Optional<Location> findById(Integer id) {
		return locationService.findById(id);
	}

	@RequestMapping(value = "/locations/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value = "/locations/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		locationService.delete(id);
		return "redirect:/locations";
	}

}
