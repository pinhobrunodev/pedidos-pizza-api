package com.pinhobrunodev.pizzariawebservice.repository;

import com.pinhobrunodev.pizzariawebservice.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}
