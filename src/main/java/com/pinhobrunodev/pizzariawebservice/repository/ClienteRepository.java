package com.pinhobrunodev.pizzariawebservice.repository;

import com.pinhobrunodev.pizzariawebservice.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Long>{
    
}
