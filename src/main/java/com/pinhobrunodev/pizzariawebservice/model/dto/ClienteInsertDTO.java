package com.pinhobrunodev.pizzariawebservice.model.dto;

import com.pinhobrunodev.pizzariawebservice.model.Cliente;

public class ClienteInsertDTO {

  
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private Long pedidoId;


    public ClienteInsertDTO(){}

    public ClienteInsertDTO(Cliente entity) {
        nome = entity.getNome();
        telefone = entity.getTelefone();
        email = entity.getEmail();
        endereco = entity.getEndereco();
        pedidoId = entity.getPedido().getId();
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
