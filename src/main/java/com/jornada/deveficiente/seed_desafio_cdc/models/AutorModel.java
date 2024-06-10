package com.jornada.deveficiente.seed_desafio_cdc.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "TBL_AUTOR")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private String nome;

    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    //@Max(400)
    private String descricao;

    @Column(nullable = false)
    private Instant instante;

    @Deprecated
    public AutorModel() {
    }

    public AutorModel(String nome, String email, String descricao, Instant instante) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.instante = instante;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Instant getInstante() {
        return instante;
    }

    public void setInstante(Instant instante) {
        this.instante = instante;
    }
}
