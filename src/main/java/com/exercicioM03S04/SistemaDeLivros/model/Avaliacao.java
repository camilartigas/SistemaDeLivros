package com.exercicioM03S04.SistemaDeLivros.model;

import jakarta.persistence.*;


@Entity
@Table(name = "avaliacoes")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nota;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;

    public Avaliacao(Long id) {

    }

    public Avaliacao(Long id, int nota, Usuario usuario, Livro livro) {
        this.id = id;
        this.nota = nota;
        this.usuario = usuario;
        this.livro = livro;
    }

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public int getNota() {
        return nota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
