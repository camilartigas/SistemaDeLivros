package com.exercicioM03S04.SistemaDeLivros.repository;

import com.exercicioM03S04.SistemaDeLivros.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}