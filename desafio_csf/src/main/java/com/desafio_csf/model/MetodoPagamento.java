package com.desafio_csf.model;

public enum MetodoPagamento {
    DINHEIRO("Dinheiro"),
    CARTAO_CREDITO("Cartao de Crédito"),
    CARTAO_DEBITO("Cartao de Débito"),
    VALE_ALIMENTACAO("Vale Alimentação"),
    PIX("Pix");

    private String descricao;
    MetodoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
