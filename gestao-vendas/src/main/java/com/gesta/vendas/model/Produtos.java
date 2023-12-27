package com.gesta.vendas.model;

import jakarta.persistence.*;

@Entity
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String produto;
    private String dataVencimento;
    private int qtdEstoque;
    @Column(length = 10)
    private int codigoBarra;
    private  int lote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "id=" + id +
                ", produto='" + produto + '\'' +
                ", dataVencimento='" + dataVencimento + '\'' +
                ", qtdEstoque=" + qtdEstoque +
                ", codigoBarra=" + codigoBarra +
                ", lote=" + lote +
                '}';
    }
}
