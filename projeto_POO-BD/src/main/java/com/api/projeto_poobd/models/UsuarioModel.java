package com.api.projeto_poobd.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class UsuarioModel {

    @Id
    @Email
    private String email;

    @NotNull
    private String senha;

    @NotNull
    private String nome;

    @OneToMany(mappedBy = "usuario")
    private Set<RepertorioModel> repertorios = new HashSet<>();

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
}
