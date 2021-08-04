package com.hquang.AppSpring.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.hquang.AppSpring.models.User;
import com.hquang.AppSpring.services.UserService;

@Controller
public class UserController {
	
	@Autowired private UserService userService;
	
	//Get All Users
	@GetMapping("users")
	public String findAll(Model model){		
		return "user";
	}	

	
	//Add User
	@PostMapping(value="users/addNew")
	public RedirectView addNew(User user, RedirectAttributes redir) {
		userService.save(user);
		RedirectView redirectView = new RedirectView("/login", true);
		redir.addFlashAttribute("message", "You successfully Registered!!! You can login");
		return redirectView;
	}
}
