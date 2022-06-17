package com.api.projeto_poobd.controllers;


import com.api.projeto_poobd.models.MusicaModel;
import com.api.projeto_poobd.models.RepertorioModel;
import com.api.projeto_poobd.repositories.MusicaRepository;
import com.api.projeto_poobd.repositories.RepertorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/repertorio")
public class RepertorioController {

    @Autowired
    RepertorioRepository repertorioRepository;

    @Autowired
    MusicaRepository musicaRepository;


    @GetMapping
    public List<RepertorioModel> getRepertorio() {

        return repertorioRepository.findAll();

    }

    @GetMapping("/{id}")
    public Optional<RepertorioModel> getRepertorioById(@PathVariable Integer id){
        return repertorioRepository.findById(id);
    }



    @Transactional
    @PostMapping
    public void createRepertorio(@RequestBody RepertorioModel repertorio) {
        repertorioRepository.save(repertorio);
    }

    @PutMapping("/{repertorioId}/musica/{musicaId}")
    public void addMusicaToRepertorio(
            @PathVariable Integer repertorioId,
            @PathVariable Integer musicaId
    ) {
        RepertorioModel repertorio = repertorioRepository.findById(repertorioId).get();
        MusicaModel musica = musicaRepository.findById(musicaId).get();
        repertorio.getMusicasNoRepertorio().add(musica);
        repertorio.setQtdMusicas(repertorio.getQtdMusicas()+1);
         repertorioRepository.save(repertorio);
    }
    
    @Transactional
    @DeleteMapping("/{id}")
     public void deleteRepertorio(@PathVariable(value = "id") Integer id){
        RepertorioModel repertorio = repertorioRepository.findById(id).get();
         repertorioRepository.delete(repertorio);
    }

}
