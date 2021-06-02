package com.pinhobrunodev.pizzariawebservice.services;

import java.util.List;
import java.util.stream.Collectors;

import com.pinhobrunodev.pizzariawebservice.model.dto.ProdutoDTO;
import com.pinhobrunodev.pizzariawebservice.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Transactional(readOnly = true)
    public List<ProdutoDTO> findAll() {
        return repository.findAll().stream().map(x->new ProdutoDTO(x)).collect(Collectors.toList());
    }
    
}
