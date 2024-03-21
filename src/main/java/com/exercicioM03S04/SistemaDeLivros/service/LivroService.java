package com.exercicioM03S04.SistemaDeLivros.service;

import com.exercicioM03S04.SistemaDeLivros.model.Livro;
import com.exercicioM03S04.SistemaDeLivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro salvarLivro(Livro livro) {
        // Implemente a lógica de validação se necessário
        return livroRepository.save(livro);
    }

    // Outros métodos de serviço, se necessário
}