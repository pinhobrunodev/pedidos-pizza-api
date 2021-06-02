package com.pinhobrunodev.pizzariawebservice.model.dto;

import com.pinhobrunodev.pizzariawebservice.model.Cliente;
import com.pinhobrunodev.pizzariawebservice.model.enums.Tamanho;
import com.pinhobrunodev.pizzariawebservice.model.enums.TipoSabor;

public class ClienteDTO {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private TipoSabor sabor;
    private Tamanho tamanho;
    private Double valor;

    public ClienteDTO(){}

    public ClienteDTO(Cliente entity) {
        nome = entity.getNome();
        telefone = entity.getTelefone();
        email = entity.getEmail();
        endereco = entity.getEndereco();
        sabor = entity.getPedido().getProduto().getSabor();
        tamanho = entity.getPedido().getProduto().getTamanho();
        valor = entity.getPedido().getPreco();
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public TipoSabor getSabor() {
        return sabor;
    }
    public Tamanho getTamanho() {
        return tamanho;
    }
    public String getTelefone() {
        return telefone;
    }
    public Double getValor() {
        return valor;
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
    public void setSabor(TipoSabor sabor) {
        this.sabor = sabor;
    }
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
