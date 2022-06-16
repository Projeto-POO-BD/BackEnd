package com.api.projeto_poobd.controllers;

import com.api.projeto_poobd.models.MusicaModel;
import com.api.projeto_poobd.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musica")


public class MusicaController {

    @Autowired
    MusicaRepository musicaRepository;

    @GetMapping
    List<MusicaModel> getMusicas(){

        return musicaRepository.findAll();

    }

    @PostMapping
    MusicaModel createMusica(@RequestBody MusicaModel musica) {
        return musicaRepository.save(musica);
    }



}
