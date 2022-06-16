package com.api.projeto_poobd.repositories;

import com.api.projeto_poobd.models.ShowsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowsRepository extends JpaRepository<ShowsModel, String> {
}
