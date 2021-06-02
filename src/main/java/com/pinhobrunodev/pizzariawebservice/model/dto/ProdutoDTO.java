package com.pinhobrunodev.pizzariawebservice.model.dto;

import java.io.Serializable;

import com.pinhobrunodev.pizzariawebservice.model.Produto;
import com.pinhobrunodev.pizzariawebservice.model.enums.Tamanho;
import com.pinhobrunodev.pizzariawebservice.model.enums.TipoSabor;

public class ProdutoDTO implements Serializable {

    private Long id;
    private Tamanho tamanho;
    private TipoSabor sabor;

    public ProdutoDTO() {
    }

    /**
     * 
     * retorna o productDTO ja com id setado
     */

    public ProdutoDTO(Produto entity){
        id = entity.getId();
        tamanho = entity.getTamanho();
        sabor = entity.getSabor();
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
    public void setSabor(TipoSabor sabor) {
        this.sabor = sabor;
    }
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
