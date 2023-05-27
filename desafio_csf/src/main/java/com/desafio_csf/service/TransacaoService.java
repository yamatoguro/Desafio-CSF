package com.desafio_csf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio_csf.model.Transacao;
import com.desafio_csf.repository.TransacaoRepository;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repository;

    public Transacao novoTransacao(Transacao transacao) {
        return repository.save(transacao);
    }

    public Transacao getTransacao(long id) {
        return repository.findById(id).get();
    }

    public List<Transacao> getTransacoes() {
        return repository.findAll();
    }

    public void deleteTransacao(long id) {
        repository.deleteById(id);
    }
}
