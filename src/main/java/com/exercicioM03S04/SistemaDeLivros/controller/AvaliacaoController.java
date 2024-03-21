package com.exercicioM03S04.SistemaDeLivros.controller;

import com.exercicioM03S04.SistemaDeLivros.model.Avaliacao;
import com.exercicioM03S04.SistemaDeLivros.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping("/avaliar")
    public ResponseEntity<Avaliacao> avaliarLivro(@RequestBody Avaliacao avaliacao) {
        Avaliacao novaAvaliacao = avaliacaoService.salvarAvaliacao(avaliacao);
        return new ResponseEntity<>(novaAvaliacao, HttpStatus.CREATED);
    }

    // Outros endpoints de avaliação, se necessário
}