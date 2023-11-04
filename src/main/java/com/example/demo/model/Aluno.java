package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Aluno extends Usuario{
    @OneToOne
    private Turma turma;
    @OneToMany
    private Collection<Prova> prova;
}
