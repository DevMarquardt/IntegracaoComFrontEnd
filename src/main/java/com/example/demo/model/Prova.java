package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name = "tb_prova")
@AllArgsConstructor


@Entity
public class Prova {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Disciplina disciplina;
    private Double nota;
}
