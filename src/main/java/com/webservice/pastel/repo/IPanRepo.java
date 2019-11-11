package com.webservice.pastel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.pastel.model.Pan;

public interface IPanRepo extends JpaRepository<Pan, Long>{

}
