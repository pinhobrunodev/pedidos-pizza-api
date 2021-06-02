package com.pinhobrunodev.pizzariawebservice.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pinhobrunodev.pizzariawebservice.model.enums.Tamanho;
import com.pinhobrunodev.pizzariawebservice.model.enums.TipoSabor;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TipoSabor sabor;
    private Tamanho tamanho;

    @OneToMany(mappedBy = "produto")
    private Set<Pedido> pedidos = new HashSet<>();

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public TipoSabor getSabor() {
        return sabor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setSabor(TipoSabor sabor) {
        this.sabor = sabor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

}
