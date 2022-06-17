package com.example.projetobdpoo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(
            nullable = false
    )
    private String email;

    @Column(
            nullable = false
    )
    private String senha;

    @Column(
            nullable = false
    )
    private String nome;

    @OneToMany(mappedBy = "usuarioRepertorio")
    private Set<RepertorioModel> repertorios = new HashSet<>();


    @OneToMany(mappedBy = "usuarioShow")
    private Set<ShowsModel> shows = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<ShowsModel> getShows() {
        return shows;
    }

    public void addShow(ShowsModel show){
        shows.add(show);
    }
    public void addRepertorio(RepertorioModel repertorio){
        repertorios.add(repertorio);
    }

    public Set<RepertorioModel> getRepertorios() {
        return repertorios;
    }

    public void setRepertorios(Set<RepertorioModel> repertorios) {
        this.repertorios = repertorios;
    }

    public void setShows(Set<ShowsModel> shows) {
        this.shows = shows;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UsuarioModel that = (UsuarioModel) o;
//        return id == that.id && email.equals(that.email) && senha.equals(that.senha) && nome.equals(that.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, email, senha, nome);
//    }
}
