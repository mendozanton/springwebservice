package com.webservice.pastel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.pastel.repo.IClienteRepo;
import com.webservice.pastel.model.Cliente;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private IClienteRepo clienteRepo;
	
	public ClienteController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/all")
	public Page<Cliente> getClientes(Pageable pageable) {
		return clienteRepo.findAll(pageable);
	}
}
