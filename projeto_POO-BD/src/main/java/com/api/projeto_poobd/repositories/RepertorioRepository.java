package com.api.projeto_poobd.repositories;

import com.api.projeto_poobd.models.RepertorioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepertorioRepository extends JpaRepository<RepertorioModel, Long> {
}
