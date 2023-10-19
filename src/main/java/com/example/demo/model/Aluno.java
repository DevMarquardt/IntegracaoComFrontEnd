package models;
import jakarta.persistence.*;

@Entity
public class Aluno extends Usuario{
    @OneToOne(cascade = CascadeType.PERSIST)
    private Turma turma;
    @OneToMany(cascade = CascadeType.PERSIST)
    private Prova prova;
}
