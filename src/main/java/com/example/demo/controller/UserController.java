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
    private UserService service;

    @GetMapping("/verificaLogin")
    public Boolean verificaLogin(@RequestParam Integer matricula, @RequestParam String senha){
        return service.verificaLogin(matricula, senha);
    }

    @GetMapping("/todos")
    public Collection<Usuario> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping
    public Usuario buscarUm(@RequestParam Integer matricula) {
        return service.buscarUm(matricula);
    }

}
