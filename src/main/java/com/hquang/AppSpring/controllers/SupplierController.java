package com.hquang.AppSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupplierController {
	@GetMapping("/supplier")
	public String getSupplier() {
		return "Supplier";
	}
}
