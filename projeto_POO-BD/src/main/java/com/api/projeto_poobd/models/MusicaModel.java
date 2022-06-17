package com.api.projeto_poobd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class MusicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String nome;
    @NotNull
    private String artista;
    @NotNull
    private String genero;

    @JsonIgnore
    @ManyToMany(mappedBy = "musicasNoRepertorio")
    private Set<RepertorioModel> repertorios = new HashSet<>();

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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<RepertorioModel> getRepertorios() {
        return repertorios;
    }

}
