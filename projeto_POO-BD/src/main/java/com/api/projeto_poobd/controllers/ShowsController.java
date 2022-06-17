package com.api.projeto_poobd.controllers;


import com.api.projeto_poobd.models.RepertorioModel;
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
    public List<ShowsModel> getShows(){
        return showsRepository.findAll();
    }

    @PostMapping
    public void createShow(@RequestBody ShowsModel show) {
        showsRepository.save(show);
    }
//    @PostMapping
//    public void createRepertorio(@RequestBody RepertorioModel repertorio) {
//
//        repertorioRepository.save(repertorio);
//    }


}
