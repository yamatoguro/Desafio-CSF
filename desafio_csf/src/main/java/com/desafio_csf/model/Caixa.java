package com.desafio_csf.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "caixa")
public class Caixa {

    public Caixa(double saldo,
          double troco,
          boolean aberto) {
            this.saldo = saldo;
            this.troco = troco;
            this.aberto = aberto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "saldo", nullable = false)
    private double saldo;

    @Column(name = "troco", nullable = false)
    private double troco;

    @Column(name = "aberto", nullable = false)
    private boolean aberto;
}
