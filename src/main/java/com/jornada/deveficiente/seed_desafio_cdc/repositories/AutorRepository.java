package com.jornada.deveficiente.seed_desafio_cdc.repositories;

import com.jornada.deveficiente.seed_desafio_cdc.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<AutorModel, UUID> {

    AutorModel findAutorModelByNome(String nome);
}
