package com.api.projeto_poobd.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class ShowsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String data;

    @NotNull
    private String local;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId", referencedColumnName = "id")
    private UsuarioModel usuarioShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        return usuarioShow;
    }

}
