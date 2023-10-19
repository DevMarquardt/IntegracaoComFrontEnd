package com.example.demo.service;

import com.example.demo.model.Professor;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@AllArgsConstructor
@Service

public class UserService {
    private UserRepository userRepository;

    public void salvar(Professor user){
        userRepository.save(user);
    }

    public Collection<Usuario> buscarTodos(){
        return userRepository.findAll();
    }

    public Usuario buscarUm(Integer id){
        return userRepository.findById(id).get();
    }

    public void deletar(Usuario user){
        userRepository.delete(user);
    }

}
