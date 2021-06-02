package com.pinhobrunodev.pizzariawebservice.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @OneToMany(mappedBy = "pedido")
    private Set<Cliente> clientes = new HashSet<>();


    public Pedido(){}

    public Long getId() {
        return id;
    }
    public Double getPreco() {
        return preco;
    }
    public Produto getProduto() {
        return produto;
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
