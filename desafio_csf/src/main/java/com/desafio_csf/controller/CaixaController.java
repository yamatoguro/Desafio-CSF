package com.desafio_csf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio_csf.model.Caixa;
import com.desafio_csf.service.CaixaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/caixa")
@CrossOrigin(origins = "http://localhost:4200")
@Tag(name = "Caixa", description = "Controller para domain Caixa")
public class CaixaController {

    @Autowired
    private CaixaService service;

    @Operation(summary = "Cadastro do Caixa por id")
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void newVeiculo(@RequestParam double saldo, @RequestParam double troco) {
        Caixa caixa = new Caixa(saldo, troco, false);
        service.novoCaixa(caixa);
    }

    @Operation(summary = "Recuperar informação do Caixa por id")
    @GetMapping(path = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Caixa getCaixa(@PathVariable long id) {
        Caixa c = service.getCaixa(id);
        return (c != null) ? c : new Caixa();
    }

    @Operation(summary = "Recuperar informação de todos os Caixas")
    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<Caixa> getCaixas() {
        return service.getCaixas();
    }

    @Operation(summary = "Abre o caixa Caixa usando os parâmetros saldo e troco")
    @PutMapping(path = "/abrir/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void abrirCaixa(@PathVariable long id, @RequestParam(required = true) double troco) {
        service.abrirCaixa(id, troco);
    }

    @Operation(summary = "Fecha o caixa informando saldo consolidado")
    @PutMapping(path = "/fechar/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public double fecharCaixa(@PathVariable long id) {
        return service.fecharCaixa(id);
    }
}
