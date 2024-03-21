package com.exercicioM03S04.SistemaDeLivros.service;

import com.exercicioM03S04.SistemaDeLivros.model.Avaliacao;
import com.exercicioM03S04.SistemaDeLivros.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public Avaliacao salvarAvaliacao(Avaliacao avaliacao) {
        // Implemente a lógica de validação se necessário
        return avaliacaoRepository.save(avaliacao);
    }

    // Outros métodos de serviço, se necessário
}