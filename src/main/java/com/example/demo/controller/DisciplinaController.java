package com.example.demo.controller;

import com.example.demo.model.Disciplina;
import com.example.demo.model.Professor;
import com.example.demo.model.Turma;
import com.example.demo.model.Usuario;
import com.example.demo.service.DisciplinaService;
import com.example.demo.service.TurmaService;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@AllArgsConstructor
@RequestMapping("disciplina")
public class DisciplinaController {
    private DisciplinaService service;

    @PostMapping
    public void adicionar(@RequestBody Disciplina objeto) {
        service.salvar(objeto);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Disciplina objeto) {

        if (service.buscarUm(id) != null) {
            service.salvar(objeto);
        }
    }

    @GetMapping("/todos")
    public Collection<Disciplina> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping
    public Disciplina buscarUm(@RequestParam Integer id) {
        return service.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody Disciplina
                                objeto) {
        service.deletar(objeto);
    }
}
