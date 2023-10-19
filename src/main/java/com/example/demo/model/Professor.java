package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor

public class Professor extends Usuario{
    @OneToOne(cascade = CascadeType.PERSIST)
    private Disciplina disciplina;
}
