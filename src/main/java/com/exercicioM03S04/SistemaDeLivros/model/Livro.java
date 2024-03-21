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

    public Livro(Long id) {

    }

    public Livro(Long id, String titulo, Usuario usuario, int anoPublicacao, List<Avaliacao> avaliacoes) {
        this.id = id;
        this.titulo = titulo;
        this.usuario = usuario;
        this.anoPublicacao = anoPublicacao;
        this.avaliacoes = avaliacoes;
    }

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
