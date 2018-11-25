package com.ecommerce.bakerymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserUIConfigurationController {

	@GetMapping("/home")
	public String showMainPage(Model modelMap) {

		modelMap.addAttribute("name", "welcome to Spring Boot!!");
		return "home";
	}

		

}
