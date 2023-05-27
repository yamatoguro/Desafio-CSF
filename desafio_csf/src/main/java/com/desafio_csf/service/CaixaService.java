package com.desafio_csf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio_csf.model.Caixa;
import com.desafio_csf.repository.CaixaRepository;

@Service
public class CaixaService {

    @Autowired
    private CaixaRepository repository;

    public Caixa novoCaixa(Caixa caixa) {
        return repository.save(caixa);
    }

    public Caixa getCaixa(long id) {
        return repository.findById(id).get();
    }

    public List<Caixa> getCaixas() {
        return repository.findAll();
    }

    public boolean abrirCaixa(long id, double troco) {
        Caixa caixa = repository.findById(id).get();
        if (!caixa.isAberto()) {
            caixa.setAberto(true);
            caixa.setSaldo(troco);
            caixa.setTroco(troco);
            repository.save(caixa);
            return true;
        } else
            return false;
    }

    public double fecharCaixa(long id) {
        Caixa caixa = repository.findById(id).get();
        if (caixa.isAberto()) {
            double saldoConsolidado = caixa.getSaldo() - caixa.getTroco();
            caixa.setAberto(false);
            repository.save(caixa);
            return saldoConsolidado;
        } else
            return -1;
    }

    public void deleteCaixa(long id) {
        repository.deleteById(id);
    }
}
