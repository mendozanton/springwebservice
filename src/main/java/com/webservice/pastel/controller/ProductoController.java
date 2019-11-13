package com.webservice.pastel.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.pastel.model.Producto;
import com.webservice.pastel.service.ServiceProducto;

@RestController
@RequestMapping("producto")
public class ProductoController {
	@Autowired
	ServiceProducto dao;

	public ProductoController() {

	}

	@GetMapping("/all")
	public ResponseEntity<List<Producto>> findAll() {
		return ResponseEntity.ok(dao.findAll());
	}

	@PostMapping
	public ResponseEntity create(@Valid @RequestBody Producto producto) {
		return ResponseEntity.ok(dao.save(producto));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Producto> findById(@PathVariable Long id) {
		Optional<Producto> stock = dao.findById(id);
		if (!stock.isPresent()) {
			// log.error("Id " + id + " is not existed");
			ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(stock.get());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Producto> update(@PathVariable Long id, @Valid @RequestBody Producto product) {
		if (!dao.findById(id).isPresent()) {
			// log.error("Id " + id + " is not existed");
			ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(dao.save(product));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		if (!dao.findById(id).isPresent()) {
			// log.error("Id " + id + " is not existed");
			ResponseEntity.badRequest().build();
		}

		dao.deleteById(id);

		return ResponseEntity.ok().build();
	}

}
