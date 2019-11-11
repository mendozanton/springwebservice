package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Postre;

public interface IPostreRepo extends JpaRepository<Postre, Long>{

}
