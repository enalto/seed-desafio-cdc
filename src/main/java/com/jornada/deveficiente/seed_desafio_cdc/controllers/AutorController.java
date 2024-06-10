package com.jornada.deveficiente.seed_desafio_cdc.controllers;

import com.jornada.deveficiente.seed_desafio_cdc.dtos.AutorRecordDto;
import com.jornada.deveficiente.seed_desafio_cdc.models.AutorModel;
import com.jornada.deveficiente.seed_desafio_cdc.services.AutorService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deveficiente/autores")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public ResponseEntity<AutorModel> saveAutor(@RequestBody @Valid AutorRecordDto autorRecordDto){
        return ResponseEntity.ok().body(autorService.saveAutor(autorRecordDto));
        //return ResponseEntity.status(HttpStatus.CREATED).body(autorService.saveAutor(autorRecordDto));
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> getAllAutores(){
        return ResponseEntity.status(HttpStatus.OK).body(autorService.getAllAutores());
    }
}
