package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Secretario extends Usuario{
    private Integer qtdBoletinsGerados;
}
