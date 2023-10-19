package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Data
@Table(name = "tb_turma")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turma {
    @Id
    private String nome;
    @OneToMany
    private Collection<Aluno> alunos;
    @OneToMany
    private Collection<Professor> professores;
}
