package com.hquang.AppSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoutryController {
	@GetMapping("/countries")
	public String getCountries() {
		return "country";
	}

}
