package com.webservice.pastel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.pastel.repo.IClienteRepo;
//import com.webservice.pastel.repo.IUsuarioRepo;
import com.webservice.pastel.model.Cliente;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	IClienteRepo clienteRepo;

	public DemoController() {
		
	}

	@GetMapping
	private List<Cliente> foo() {
		return clienteRepo.findAll();

	}
}
