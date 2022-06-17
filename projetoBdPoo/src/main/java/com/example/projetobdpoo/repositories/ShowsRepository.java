package com.example.projetobdpoo.repositories;

import com.example.projetobdpoo.models.ShowsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowsRepository extends JpaRepository<ShowsModel, Integer> {
}
