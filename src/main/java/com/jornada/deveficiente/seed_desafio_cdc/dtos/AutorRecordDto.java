package com.jornada.deveficiente.seed_desafio_cdc.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AutorRecordDto(@NotBlank String nome,
                             @NotBlank @Email String email,
                             @NotBlank String descricao) {
}
