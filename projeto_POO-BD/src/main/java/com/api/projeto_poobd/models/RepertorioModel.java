package com.api.projeto_poobd.models;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class RepertorioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String nome;

    private int qtdMusicas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId", referencedColumnName = "id")
    private UsuarioModel usuarioRepertorio;

    @ManyToMany
    @JoinTable(
            name = "musicas_repertorio",
            joinColumns = @JoinColumn(name = "repertorioId"),
            inverseJoinColumns = @JoinColumn(name = "musicaId")
    )
    private Set<MusicaModel> musicasNoRepertorio = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public UsuarioModel getUsuario() {
        return usuarioRepertorio;
    }

    public Set<MusicaModel> getMusicasNoRepertorio() {
        return musicasNoRepertorio;
    }
}
