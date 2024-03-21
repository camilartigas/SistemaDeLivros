package com.exercicioM03S04.SistemaDeLivros.service;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Entity
@Table(name = "usuarios")
public class UserDetails implements org.springframework.security.core.userdetails.UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String senha;

    // Outros campos, getters e setters

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; // Implemente se houver necessidade de autoridades/grupos de usuário
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Implemente lógica se necessário
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Implemente lógica se necessário
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Implemente lógica se necessário
    }

    @Override
    public boolean isEnabled() {
        return true; // Implemente lógica se necessário
    }
}
