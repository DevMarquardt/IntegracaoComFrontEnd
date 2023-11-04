package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends Usuario{
    @OneToOne(cascade = CascadeType.PERSIST)
    private Disciplina disciplina;
}
