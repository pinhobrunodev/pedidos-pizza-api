package com.pinhobrunodev.pizzariawebservice.mapper;

import com.pinhobrunodev.pizzariawebservice.model.Produto;
import com.pinhobrunodev.pizzariawebservice.model.dto.ProdutoDTO;

import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto toEntity(ProdutoDTO dto) {
        Produto entity = new Produto();
        entity.setSabor(dto.getSabor());
        entity.setTamanho(dto.getTamanho());
        return entity;
    }

    public ProdutoDTO toProdutoDTO(Produto entity) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setSabor(entity.getSabor());
        dto.setTamanho(entity.getTamanho());
        return dto;
    }

}
