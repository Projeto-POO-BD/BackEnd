
package com.example.projetobdpoo.repositories;

import com.example.projetobdpoo.models.MusicaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicaRepository extends JpaRepository<MusicaModel, Integer> {

}

