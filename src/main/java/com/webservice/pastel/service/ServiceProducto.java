package com.webservice.pastel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.pastel.model.Producto;
import com.webservice.pastel.repo.IProductoRepo;

@Service
public class ServiceProducto {

	@Autowired
	private IProductoRepo dao;

	public List<Producto> findAll() {
		return dao.findAll();
	}

	public Optional<Producto> findById(Long id) {
		return dao.findById(id);
	}

	public Producto save(Producto stock) {
		return dao.save(stock);
	}

	public void deleteById(Long id) {
		dao.deleteById(id);
	}
}
