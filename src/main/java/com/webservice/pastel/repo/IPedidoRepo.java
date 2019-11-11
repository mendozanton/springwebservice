package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Pedido;

public interface IPedidoRepo extends JpaRepository<Pedido, Long>{

}
