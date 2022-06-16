package com.api.projeto_poobd.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class ShowsModel {

    @Id
    @NotNull
    private String data;

    @NotNull
    private String local;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId", referencedColumnName = "email")
    private UsuarioModel usuario;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

}
