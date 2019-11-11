package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Long>{

}
