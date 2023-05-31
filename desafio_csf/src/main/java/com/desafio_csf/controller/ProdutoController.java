package com.desafio_csf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio_csf.model.Produto;
import com.desafio_csf.service.ProdutoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping(value = "/produto")
@CrossOrigin(origins = "http://localhost:4200")
@Tag(name = "Produto", description = "Controller para domain Produto")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @Operation(summary = "Cadastro do Produto por id")
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void newVeiculo(@RequestParam double saldo, @RequestParam double troco) {
        Produto produto = new Produto();
        service.novoProduto(produto);
    }

    @Operation(summary = "Recuperar informação do Produto por id")
    @GetMapping(path = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Produto getProduto(@PathVariable long id) {
        Produto p = service.getProduto(id);
        return (p != null) ? p : new Produto();
    }

    @Operation(summary = "Recuperar informação de todos os Produtos")
    @GetMapping(path = "/todos")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Produto> getProdutos() {
        return service.getProdutos();
    }
}
