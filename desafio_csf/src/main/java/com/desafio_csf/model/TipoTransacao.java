package com.desafio_csf.model;

public enum TipoTransacao {
    COMPRA("Compra"),
    VENDA("Venda"),
    CANCELAMENTO("Cancelamento");

    TipoTransacao(String descricao) {
        this.descricao = descricao;
    }

    public String descricao;

    public String getDescricao() {
        return this.descricao;
    }
}