package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.model.Secretario;
import com.example.demo.model.Usuario;
import com.example.demo.service.AlunoService;
import com.example.demo.service.SecretarioService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
@Data
@RequestMapping("secretario")

public class SecretarioController {
    private SecretarioService service;

    @PostMapping
    public void adicionar(@RequestBody Secretario objeto) {
        service.salvar(objeto);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Secretario objeto) {

        if (service.buscarUm(id) != null) {
            service.salvar(objeto);
        }
    }

    @GetMapping("/todos")
    public Collection<Secretario> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping
    public Usuario buscarUm(@RequestParam Integer id) {
        return service.buscarUm(id);
    }

    @DeleteMapping
    public void deletar(@RequestBody Secretario objeto) {
        service.deletar(objeto);
    }
}
