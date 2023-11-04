package com.example.demo.controller;

import com.example.demo.model.Professor;
import com.example.demo.model.Turma;
import com.example.demo.model.Usuario;
import com.example.demo.service.ProfessorService;
import com.example.demo.service.TurmaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("turma")

public class TurmaController {
    private TurmaService service;

    @PostMapping
    public void adicionar(@RequestBody Turma objeto) {
        service.salvar(objeto);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Turma objeto) {

        if (service.buscarUm(id) != null) {
            service.salvar(objeto);
        }
    }

    @GetMapping("/todos")
    public Collection<Turma> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping
    public Turma buscarUm(@RequestParam Integer id) {
        return service.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody Turma
                                    objeto) {
        service.deletar(objeto);
    }

}
