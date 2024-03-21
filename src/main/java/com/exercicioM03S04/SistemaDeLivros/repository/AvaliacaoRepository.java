package com.exercicioM03S04.SistemaDeLivros.repository;

import com.exercicioM03S04.SistemaDeLivros.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}