package com.api.projeto_poobd.controllers;

import com.api.projeto_poobd.models.UsuarioModel;
import com.api.projeto_poobd.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    List<UsuarioModel> getShows(){

        return usuarioRepository.findAll();
    }

    @PostMapping
    UsuarioModel createMusica(@RequestBody UsuarioModel musica) {
        return usuarioRepository.save(musica);
    }


}
