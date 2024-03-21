package com.exercicioM03S04.SistemaDeLivros.controller;

import com.exercicioM03S04.SistemaDeLivros.model.Livro;
import com.exercicioM03S04.SistemaDeLivros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro) {
        Livro novoLivro = livroService.salvarLivro(livro);
        return new ResponseEntity<>(novoLivro, HttpStatus.CREATED);
    }

    // Outros endpoints do livro, se necessário
}
