package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.model.Disciplina;
import com.example.demo.repository.DisciplinaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class DisciplinaService {
    private DisciplinaRepository repository;

    public void salvar(Disciplina objeto){
        repository.save(objeto);
    }
    public Disciplina buscarUm(Integer id){
        return repository.findById(id).get();
    }
    public Collection<Disciplina> buscarTodos(){
        return repository.findAll();
    }
    public void deletar(Disciplina objeto){
        repository.delete(objeto);
    }
}
