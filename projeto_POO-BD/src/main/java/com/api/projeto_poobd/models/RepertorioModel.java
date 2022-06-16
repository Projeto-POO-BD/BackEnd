package com.api.projeto_poobd.models;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class RepertorioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private int qtdMusicas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId", referencedColumnName = "email")
    private UsuarioModel usuario;

    @ManyToMany
    @JoinTable(
            name = "musicas_repertorio",
            joinColumns = @JoinColumn(name = "repertorioId"),
            inverseJoinColumns = @JoinColumn(name = "musicaId")
    )
    private Set<MusicaModel> musicasNoRepertorio = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public Set<MusicaModel> getMusicasNoRepertorio() {
        return musicasNoRepertorio;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }
}