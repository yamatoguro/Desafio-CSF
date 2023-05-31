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

import com.desafio_csf.model.Transacao;
import com.desafio_csf.service.TransacaoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping(value = "/transacao")
@CrossOrigin(origins = "http://localhost:4200")
@Tag(name = "Transação", description = "Controller para domain Transação")
public class TransacaoController {
    @Autowired
    private TransacaoService service;

    @Operation(summary = "Cadastro do Transacao por id")
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void newVeiculo(@RequestParam double saldo, @RequestParam double troco) {
        Transacao produto = new Transacao();
        service.novoTransacao(produto);
    }

    @Operation(summary = "Recuperar informação do Transacao por id")
    @GetMapping(path = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Transacao getTransacao(@PathVariable long id) {
        Transacao p = service.getTransacao(id);
        return (p != null) ? p : new Transacao();
    }

    @Operation(summary = "Recuperar informação de todos os Transacaos")
    @GetMapping(path = "/todos")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Transacao> getTransacoes() {
        return service.getTransacoes();
    }
}
