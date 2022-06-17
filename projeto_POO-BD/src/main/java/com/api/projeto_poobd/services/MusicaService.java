package com.api.projeto_poobd.services;

import com.api.projeto_poobd.models.MusicaModel;
import com.api.projeto_poobd.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MusicaService{

    @Autowired
    MusicaRepository musicaRepository;


//    public MusicaModel findByName(String nomeMusica) {
//        return musicaRepository.findByName(nomeMusica);
//    }


}
