package models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Entity
public class Prova {
    @OneToOne
    private Disciplina disciplina;
    private Double nota;
}
