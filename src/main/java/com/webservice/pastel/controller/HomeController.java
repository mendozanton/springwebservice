package com.webservice.pastel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}
	@GetMapping("/")
	public String getRaiz() {
		return "index";
	}
}
