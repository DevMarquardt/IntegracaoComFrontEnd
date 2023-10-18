package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
@RequestMapping("users")

public class UserController {
    private UserService userService;

    @PostMapping
    public void adicionar(@RequestBody User user) {
        userService.salvar(user);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody User user) {

        if (userService.buscarUm(id) != null) {
            userService.salvar(user);
        }
    }

    @GetMapping("/todos")
    public Collection<User> buscarTodos() {
        return userService.buscarTodos();
    }

    @GetMapping
    public User buscarUm(@RequestParam Integer id) {
        return userService.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody User user) {
        userService.deletar(user);
    }
}
