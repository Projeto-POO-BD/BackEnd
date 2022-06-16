package com.api.projeto_poobd.controllers;


import com.api.projeto_poobd.models.ShowsModel;
import com.api.projeto_poobd.repositories.ShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
public class ShowsController {

    @Autowired
    ShowsRepository showsRepository;

    @GetMapping
    List<ShowsModel> getShows(){

        return showsRepository.findAll();

    }

    @PostMapping
    ShowsModel createMusica(@RequestBody ShowsModel musica) {
        return showsRepository.save(musica);
    }


}
