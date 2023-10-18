package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@AllArgsConstructor
@Service

public class UserService {
    private UserRepository userRepository;

    public void salvar(User user){
        userRepository.save(user);
    }

    public Collection<User> buscarTodos(){
        return userRepository.findAll();
    }

    public User buscarUm(Integer id){
        return userRepository.findById(id).get();
    }

    public void deletar(User user){
        userRepository.delete(user);
    }

}
