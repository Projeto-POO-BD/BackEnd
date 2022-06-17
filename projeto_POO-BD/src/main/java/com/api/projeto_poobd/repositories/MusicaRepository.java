package com.api.projeto_poobd.repositories;

import com.api.projeto_poobd.models.MusicaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicaRepository extends JpaRepository<MusicaModel, Integer> {

    //MusicaModel findByName(String nomeMusica);
}
