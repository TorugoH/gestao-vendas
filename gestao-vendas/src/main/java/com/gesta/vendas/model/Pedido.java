package com.gesta.vendas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;

    private  String nomeComprador;
    private  int qtd;
    private  float precoUnitario;

    @Column(name = "produto")
    @OneToMany(mappedBy ="pedido")
    private List<Produtos> produto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public List<Produtos> getProduto() {
        return produto;
    }

    public void setProduto(List<Produtos> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", nomeComprador='" + nomeComprador + '\'' +
                ", qtd=" + qtd +
                ", precoUnitario=" + precoUnitario +
                ", produto=" + produto +
                '}';
    }
}
