package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Preferencia;

public interface IPreferenciaRepo extends JpaRepository<Preferencia, Long>{

}
