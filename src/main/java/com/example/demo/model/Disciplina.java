package models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Entity
public class Disciplina{
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double cargaHoraria;
}
