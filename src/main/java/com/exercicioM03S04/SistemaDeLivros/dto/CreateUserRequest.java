package com.exercicioM03S04.SistemaDeLivros.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateUserRequest(
        @NotBlank(message = "O nome não pode estar em branco")
        String nome,
        
        @NotBlank(message = "O e-mail não pode estar em branco")
        @Email(message = "E-mail inválido")
        String email,
        
        @NotBlank(message = "A senha não pode estar em branco")
        @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
        String senha
) {}
