package com.desafio_csf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio_csf.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
