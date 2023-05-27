package com.desafio_csf.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tipoTransacao")
    private TipoTransacao tipo;

    @ManyToOne
    @JoinColumn(name = "produto")
    private Produto produto;

    @Column(name = "quantidade")
    private long qtd;

    @Column(name = "tipoPagamento")
    private MetodoPagamento pagamento;

    @Column(name = "horaDaTransacao")
    private Instant data;

    @OneToOne
    @JoinColumn(name = "caixaResponsavel")
    private Caixa responsavel;
}
