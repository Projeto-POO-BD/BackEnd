package com.example.projetobdpoo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class MusicaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(
            nullable = false
    )
    private String nome;
    @Column(
            nullable = false
    )
    private String artista;
    @Column(
            nullable = false
    )
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MusicaModel that = (MusicaModel) o;
//        return id.equals(that.id) && nome.equals(that.nome) && artista.equals(that.artista) && genero.equals(that.genero);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nome, artista, genero);
//    }
}
