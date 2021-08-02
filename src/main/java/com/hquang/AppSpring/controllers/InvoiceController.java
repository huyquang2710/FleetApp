package com.hquang.AppSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
	@GetMapping("/invoice")
	public String getInvoice() {
		return "Invoice";
	}
}
