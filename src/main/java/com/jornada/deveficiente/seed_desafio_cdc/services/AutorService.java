package com.jornada.deveficiente.seed_desafio_cdc.services;

import com.jornada.deveficiente.seed_desafio_cdc.dtos.AutorRecordDto;
import com.jornada.deveficiente.seed_desafio_cdc.models.AutorModel;
import com.jornada.deveficiente.seed_desafio_cdc.repositories.AutorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public AutorModel saveAutor(AutorRecordDto autor){
        AutorModel newAutor = new AutorModel(autor.nome(), autor.email(), autor.descricao(), Instant.now());
        return autorRepository.save(newAutor);
    }

    public List<AutorModel> getAllAutores(){
        return autorRepository.findAll();
    }

}
