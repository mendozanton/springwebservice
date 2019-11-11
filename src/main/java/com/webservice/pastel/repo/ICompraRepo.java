package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Compra;

public interface ICompraRepo extends JpaRepository<Compra, Long>{

}
