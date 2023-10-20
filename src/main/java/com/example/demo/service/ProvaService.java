package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.model.Prova;
import com.example.demo.repository.ProvaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProvaService {
    private ProvaRepository repository;

    public void salvar(Prova objeto){
        repository.save(objeto);
    }
    public Prova buscarUm(Integer id){
        return repository.findById(id).get();
    }
    public Collection<Prova> buscarTodos(){
        return repository.findAll();
    }
    public void deletar(Prova objeto){
        repository.delete(objeto);
    }
}
