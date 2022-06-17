package com.example.projetobdpoo.controllers;

import com.example.projetobdpoo.models.MusicaModel;
import com.example.projetobdpoo.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteRepertorio(@PathVariable(value = "id") Integer id){
        MusicaModel musica = musicaRepository.findById(id).get();
        musicaRepository.delete(musica);
    }
}
