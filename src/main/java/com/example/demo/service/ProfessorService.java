package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.model.Professor;
import com.example.demo.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorService {
    private ProfessorRepository repository;

    public void salvar(Professor objeto){
        repository.save(objeto);
    }
    public Professor buscarUm(Integer id){
        return repository.findById(id).get();
    }
    public Collection<Professor> buscarTodos(){
        return repository.findAll();
    }
    public void deletar(Professor objeto){
        repository.delete(objeto);
    }
}
