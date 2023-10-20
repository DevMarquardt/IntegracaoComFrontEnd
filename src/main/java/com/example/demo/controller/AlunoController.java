package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.model.Usuario;
import com.example.demo.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
@RequestMapping("aluno")
public class AlunoController {
    private AlunoService service;

    @PostMapping
    public void adicionar(@RequestBody Aluno user) {
        service.salvar(user);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Aluno user) {

        if (service.buscarUm(id) != null) {
            service.salvar(user);
        }
    }

    @GetMapping("/todos")
    public Collection<Aluno> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping
    public Usuario buscarUm(@RequestParam Integer id) {
        return service.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody Aluno aluno) {
        service.deletar(aluno);
    }
}
