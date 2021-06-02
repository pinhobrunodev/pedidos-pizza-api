package com.pinhobrunodev.pizzariawebservice.controller;

import java.util.List;

import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteDTO;
import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteInsertDTO;
import com.pinhobrunodev.pizzariawebservice.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
    

    @Autowired
    private ClienteService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> save(@RequestBody ClienteInsertDTO dto){
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(value = "/pedidos",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClienteDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
