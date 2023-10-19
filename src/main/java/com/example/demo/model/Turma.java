package models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Entity
public class Turma {
    @Id
    @Column(unique = true)
    private String nome;
    @OneToMany
    private Aluno aluno;
    @OneToMany
    private Professor professor;
}
