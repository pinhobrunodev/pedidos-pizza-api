package com.pinhobrunodev.pizzariawebservice.controller;

import java.util.List;

import com.pinhobrunodev.pizzariawebservice.model.dto.ProdutoDTO;
import com.pinhobrunodev.pizzariawebservice.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProdutoDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
