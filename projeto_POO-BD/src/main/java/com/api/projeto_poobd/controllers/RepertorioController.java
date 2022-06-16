package com.api.projeto_poobd.controllers;


import com.api.projeto_poobd.models.RepertorioModel;
import com.api.projeto_poobd.repositories.MusicaRepository;
import com.api.projeto_poobd.repositories.RepertorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repertorio")
public class RepertorioController {

    @Autowired
    RepertorioRepository repertorioRepository;

    @Autowired
    MusicaRepository musicaRepository;

    @GetMapping
    List<RepertorioModel> getRepositorio(){

        return repertorioRepository.findAll();

    }

    @PostMapping
    RepertorioModel createMusica(@RequestBody RepertorioModel musica) {
        return repertorioRepository.save(musica);
    }

}
