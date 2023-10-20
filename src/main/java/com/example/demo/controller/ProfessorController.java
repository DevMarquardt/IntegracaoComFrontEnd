package com.example.demo.controller;

import com.example.demo.model.Professor;
import com.example.demo.model.Secretario;
import com.example.demo.model.Usuario;
import com.example.demo.service.ProfessorService;
import com.example.demo.service.SecretarioService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@Data
@RequestMapping("professor")

public class ProfessorController {
    private ProfessorService service;

    @PostMapping
    public void adicionar(@RequestBody Professor objeto) {
        service.salvar(objeto);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Professor objeto) {

        if (service.buscarUm(id) != null) {
            service.salvar(objeto);
        }
    }

    @GetMapping("/todos")
    public Collection<Professor> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping
    public Usuario buscarUm(@RequestParam Integer id) {
        return service.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody Professor objeto) {
        service.deletar(objeto);
    }

}
