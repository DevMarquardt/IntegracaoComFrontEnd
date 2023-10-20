package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.model.Turma;
import com.example.demo.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TurmaService {
    private TurmaRepository repository;

    public void salvar(Turma turma){
        repository.save(turma);
    }
    public Turma buscarUm(Integer id){
        return repository.findById(id).get();
    }
    public Collection<Turma> buscarTodos(){
        return repository.findAll();
    }
    public void deletar(Turma objeto){
        repository.delete(objeto);
    }
}
