package com.api.projeto_poobd.controllers;

import com.api.projeto_poobd.models.MusicaModel;
import com.api.projeto_poobd.models.RepertorioModel;
import com.api.projeto_poobd.models.ShowsModel;
import com.api.projeto_poobd.models.UsuarioModel;
import com.api.projeto_poobd.repositories.RepertorioRepository;
import com.api.projeto_poobd.repositories.ShowsRepository;
import com.api.projeto_poobd.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ShowsRepository showsRepository;

    @Autowired
    RepertorioRepository repertorioRepository;

    @GetMapping
    public List<UsuarioModel> getShows(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public void createUsuario(@RequestBody UsuarioModel usuario) {
        usuarioRepository.save(usuario);
    }

    @PutMapping("/{usuarioId}/shows/{showId}")
    UsuarioModel addShowToUsuario(
            @PathVariable Integer usuarioId,
            @PathVariable Integer showId
    ) {
        UsuarioModel usuario = usuarioRepository.findById(usuarioId).get();
        ShowsModel show = showsRepository.findById(showId).get();
        usuario.getShows().add(show);
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{usuarioId}/repertorio/{repertorioId}")
    UsuarioModel addRepertorioToUsuario(
            @PathVariable Integer usuarioId,
            @PathVariable Integer repertorioId
    ) {
        UsuarioModel usuario = usuarioRepository.findById(usuarioId).get();
        RepertorioModel repertorio = repertorioRepository.findById(repertorioId).get();
        usuario.getRepertorios().add(repertorio);
        return usuarioRepository.save(usuario);
    }

}
