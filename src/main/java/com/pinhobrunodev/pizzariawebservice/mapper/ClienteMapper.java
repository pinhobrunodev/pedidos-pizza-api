package com.pinhobrunodev.pizzariawebservice.mapper;

import com.pinhobrunodev.pizzariawebservice.model.Cliente;
import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteDTO;
import com.pinhobrunodev.pizzariawebservice.model.dto.ClienteInsertDTO;
import com.pinhobrunodev.pizzariawebservice.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    

    @Autowired
    private PedidoRepository repository;

    public Cliente toEntity(ClienteInsertDTO dto){
        Cliente entity = new Cliente();
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setEndereco(dto.getEndereco());
        entity.setTelefone(dto.getTelefone());
        entity.setPedido(repository.getOne(dto.getPedidoId()));
        return entity;
    }

    public ClienteDTO toClienteDTO(Cliente entity){
        ClienteDTO dto = new ClienteDTO();
        dto.setNome(entity.getNome());
        dto.setEmail(entity.getEmail());
        dto.setEndereco(entity.getEndereco());
        dto.setTelefone(entity.getTelefone());
        dto.setSabor(entity.getPedido().getProduto().getSabor());
        dto.setTamanho(entity.getPedido().getProduto().getTamanho());
        dto.setValor(entity.getPedido().getPreco());
        return dto;
    }
}
