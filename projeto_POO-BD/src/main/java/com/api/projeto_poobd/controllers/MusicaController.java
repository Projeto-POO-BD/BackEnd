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
    public List<MusicaModel> getMusicas(){

        return musicaRepository.findAll();
    }

    @PostMapping
    public void createMusica(@RequestBody MusicaModel musica) {
        musicaRepository.save(musica);
    }
}
