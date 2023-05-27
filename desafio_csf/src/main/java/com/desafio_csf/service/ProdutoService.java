package com.desafio_csf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio_csf.model.Produto;
import com.desafio_csf.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto novoProduto(Produto produto) {
        return repository.save(produto);
    }

    public Produto getProduto(long id) {
        return repository.findById(id).get();
    }

    public List<Produto> getProdutos() {
        return repository.findAll();
    }

    public void deleteProduto(long id) {
        repository.deleteById(id);
    }
}
