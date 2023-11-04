package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlunoService {
    private AlunoRepository repository;

    public void salvar(Aluno objeto){
        objeto.setTipo("Aluno");
        repository.save(objeto);
    }
    public Aluno buscarUm(Integer id){
        return repository.findById(id).get();
    }
    public List<Aluno> buscarTodos(){
        return repository.findAll();
    }
    public void deletar(Aluno objeto){
        repository.delete(objeto);
    }

}
