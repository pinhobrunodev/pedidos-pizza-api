package com.pinhobrunodev.pizzariawebservice.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteDTO;
import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteInsertDTO;
import com.pinhobrunodev.pizzariawebservice.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public ClienteDTO save(ClienteInsertDTO dto) {
        return null;
    }

    public List<ClienteDTO> findAll() {
        return repository.findAll().stream().map(x-> new ClienteDTO(x)).collect(Collectors.toList());
    }
    
}
