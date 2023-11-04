package com.example.demo.controller;

import com.example.demo.model.Professor;
import com.example.demo.model.Prova;
import com.example.demo.model.Usuario;
import com.example.demo.service.ProvaService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("prova")

public class ProvaController {
    private ProvaService service;

    @PostMapping
    public void adicionar(@RequestBody Prova objeto) {
        service.salvar(objeto);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Prova objeto) {

        if (service.buscarUm(id) != null) {
            service.salvar(objeto);
        }
    }

    @GetMapping("/todos")
    public Collection<Prova> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping
    public Prova buscarUm(@RequestParam Integer id) {
        return service.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody Prova objeto) {
        service.deletar(objeto);
    }

}
