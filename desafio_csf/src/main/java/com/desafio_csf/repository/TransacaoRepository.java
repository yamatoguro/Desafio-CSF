package com.desafio_csf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio_csf.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}
