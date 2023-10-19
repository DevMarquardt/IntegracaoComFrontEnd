package com.example.demo.controller;

import com.example.demo.model.Professor;
import com.example.demo.model.Usuario;
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
    public void adicionar(@RequestBody Professor user) {
        userService.salvar(user);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Professor user) {

        if (userService.buscarUm(id) != null) {
            userService.salvar(user);
        }
    }

    @GetMapping("/todos")
    public Collection<Usuario> buscarTodos() {
        return userService.buscarTodos();
    }

    @GetMapping
    public Usuario buscarUm(@RequestParam Integer id) {
        return userService.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody Usuario user) {
        userService.deletar(user);
    }
}
