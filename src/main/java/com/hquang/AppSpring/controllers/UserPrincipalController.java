package com.hquang.AppSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPrincipalController {
	@GetMapping("/userPrincipal")
	public String getUserPrincipal() {
		return "UserPrincipal";
	}
}
