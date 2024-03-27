package com.costa.oak_produto_api.models;

import com.costa.oak_produto_api.DTOs.ProdutosDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Produtos {

    //<editor-fold desc="Getters and Setters">
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Boolean getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    //</editor-fold>

    @Id
    @GeneratedValue
    private String id;
    private String nomeDoProduto;
    private Double valor;
    private Boolean disponibilidade;

    public Produtos() {
        this.id = UUID.randomUUID().toString();
    }

    public Produtos(ProdutosDTO produtosDTO){
        this.id = UUID.randomUUID().toString();
        this.nomeDoProduto = produtosDTO.nomeDoProduto();
        this.valor = produtosDTO.valor();
        this.disponibilidade = produtosDTO.disponibilidade();
    }

}
