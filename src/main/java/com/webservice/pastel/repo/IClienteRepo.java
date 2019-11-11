package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.pastel.model.Cliente;

@Repository
public interface IClienteRepo extends JpaRepository<Cliente, Long>{

}
