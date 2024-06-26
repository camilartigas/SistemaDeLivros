package com.exercicioM03S04.SistemaDeLivros.controller;

import com.exercicioM03S04.SistemaDeLivros.dto.CreateUserRequest;
import com.exercicioM03S04.SistemaDeLivros.model.Usuario;
import com.exercicioM03S04.SistemaDeLivros.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.salvarUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Usuario> createUser(@Valid @RequestBody CreateUserRequest request) {
        Usuario usuario = new Usuario(request.nome(), request.email(), request.senha());
        Usuario novoUsuario = usuarioService.salvarUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }
}