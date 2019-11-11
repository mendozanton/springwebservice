package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Long>{

}
