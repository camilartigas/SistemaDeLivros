package com.exercicioM03S04.SistemaDeLivros.service;

import com.exercicioM03S04.SistemaDeLivros.model.Usuario;
import com.exercicioM03S04.SistemaDeLivros.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        // Implemente a lógica de validação se necessário
        return usuarioRepository.save(usuario);
    }

    // Outros métodos de serviço, se necessário
}