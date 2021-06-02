package com.pinhobrunodev.pizzariawebservice.repository;

import com.pinhobrunodev.pizzariawebservice.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
