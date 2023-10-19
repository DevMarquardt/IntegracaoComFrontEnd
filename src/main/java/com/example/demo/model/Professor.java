package models;

import jakarta.persistence.*;

@Entity
public class Professor extends Usuario{
    @OneToOne(cascade = CascadeType.PERSIST)
    private Disciplina disciplina;
}
