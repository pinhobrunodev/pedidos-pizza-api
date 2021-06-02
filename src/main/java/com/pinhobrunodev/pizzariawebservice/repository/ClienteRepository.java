package com.pinhobrunodev.pizzariawebservice.repository;

import java.util.Optional;

import com.pinhobrunodev.pizzariawebservice.model.Cliente;
import com.pinhobrunodev.pizzariawebservice.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Long>{

    Optional<Cliente> findByTelefone(String telefone);

    Optional<Cliente> findByEmail(String email);

    @Query("SELECT pedido FROM Pedido pedido WHERE pedido.id  = :pedidoId")
    Optional<Pedido> findByPedidoId(Long pedidoId);
    
}
