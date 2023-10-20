package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.model.Secretario;
import com.example.demo.repository.SecretarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class SecretarioService {
    private SecretarioRepository repository;

    public void salvar(Secretario secretario){
        repository.save(secretario);
    }
    public Secretario buscarUm(Integer id){
        return repository.findById(id).get();
    }
    public Collection<Secretario> buscarTodos(){
        return repository.findAll();
    }
    public void deletar(Secretario objeto){
        repository.delete(objeto);
    }}
