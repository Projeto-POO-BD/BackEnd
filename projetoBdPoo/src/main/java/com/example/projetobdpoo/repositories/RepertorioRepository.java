package com.example.projetobdpoo.repositories;

import com.example.projetobdpoo.models.RepertorioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepertorioRepository extends JpaRepository<RepertorioModel, Integer> {

}
