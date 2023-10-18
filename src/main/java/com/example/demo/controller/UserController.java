package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("users")

public class UserController {
    private UserService userService;

    @PostMapping
    public void adicionar(@RequestBody User user){
        userService.salvar(user);
    }

    @PostMapping
    public void atualizar(@RequestBody User user){
        userService.salvar(user);
    }

    @GetMapping("/todos")
    public Collection<User> buscarTodos(){
        return userService.buscarTodos();
    }

    @GetMapping
    public User buscarUm(@RequestParam Integer id){
        return userService.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody User user){
        userService.deletar(user);
    }
}
