package models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nome;
    private String endereco;
    private Integer idade;
    @Column(length = 6, nullable = false)
    private String senha;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long matricula;
}
