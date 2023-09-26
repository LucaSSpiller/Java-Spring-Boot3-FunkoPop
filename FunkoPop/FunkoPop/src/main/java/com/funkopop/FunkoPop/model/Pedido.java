package com.funkopop.FunkoPop.model;

import com.funkopop.FunkoPop.DadosCadastroPedido;
import jakarta.persistence.*;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "Pedido")
@Table(name = "TB_PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataEntrega;
    private String urlProduto;
    private String urlImagem;
    private String urlImagem2;
    private String descricao;

    public Pedido(){

    }

    public Pedido(DadosCadastroPedido dados){
        this.nomeProduto = dados.nomeProduto();
        this.urlProduto = dados.urlProduto();
        this.urlImagem = dados.urlImagem();
        this.urlImagem2 = dados.urlImagem2();
        this.descricao = dados.descricao();
    }

    public Long getId() {
        return id;
    }

    public Pedido setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Pedido setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        return this;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public Pedido setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
        return this;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public Pedido setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
        return this;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public Pedido setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
        return this;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public Pedido setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
        return this;
    }
    public String getUrlImagem2() {
        return urlImagem2;
    }

    public Pedido setUrlImagem2(String urlImagem2) {
        this.urlImagem2 = urlImagem2;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Pedido setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
