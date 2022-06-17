package com.api.projeto_poobd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String email;

    @NotNull
    private String senha;

    @NotNull
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "usuarioRepertorio")
    private Set<RepertorioModel> repertorios = new HashSet<>();

    @JsonIgnore
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

    public Set<RepertorioModel> getRepertorios() {
        return repertorios;
    }
}
