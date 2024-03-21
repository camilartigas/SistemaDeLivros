package com.exercicioM03S04.SistemaDeLivros.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private int anoPublicacao;

    @OneToMany(mappedBy = "livro", cascade = CascadeType.ALL)
    private List<Avaliacao> avaliacoes;

    // Getters e Setters
}
