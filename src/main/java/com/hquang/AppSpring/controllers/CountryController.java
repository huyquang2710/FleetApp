package com.hquang.AppSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hquang.AppSpring.models.Country;
import com.hquang.AppSpring.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String getCountries(Model model) {
		List<Country> countryList = countryService.getFindAllCountries();
		model.addAttribute("countries",countryList );
		
		return "country";
	}

}
