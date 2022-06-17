package com.example.projetobdpoo.controllers;

import com.example.projetobdpoo.models.RepertorioModel;
import com.example.projetobdpoo.models.ShowsModel;
import com.example.projetobdpoo.models.UsuarioModel;
import com.example.projetobdpoo.repositories.RepertorioRepository;
import com.example.projetobdpoo.repositories.ShowsRepository;
import com.example.projetobdpoo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    void addShowToUsuario(
            @PathVariable Integer usuarioId,
            @PathVariable Integer showId
    ) {
        UsuarioModel usuario = usuarioRepository.findById(usuarioId).get();
        ShowsModel show = showsRepository.findById(showId).get();
        usuario.addShow(show);
        usuarioRepository.save(usuario);
    }

    @PutMapping("/{usuarioId}/repertorio/{repertorioId}")
    public void  addRepertorioToUsuario(
            @PathVariable Integer usuarioId,
            @PathVariable Integer repertorioId
    ) {
        Optional<UsuarioModel> usuario = usuarioRepository.findById(usuarioId);
        Optional<RepertorioModel> repertorio = repertorioRepository.findById(repertorioId);

        if(!usuario.isPresent()){
            System.out.println("Deu ruim usuario");
        }
        if(!repertorio.isPresent()){
            System.out.println("Deu ruim repertorio");
        }
        usuario.get().getRepertorios().add(repertorio.get());
        usuarioRepository.save(usuario.get());
    }

}
