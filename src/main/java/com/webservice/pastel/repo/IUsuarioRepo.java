package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Long>{
	
}
