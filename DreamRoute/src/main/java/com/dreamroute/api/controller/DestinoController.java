package com.dreamroute.api.controller;

import com.dreamroute.api.model.Destino;
import com.dreamroute.api.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/destinos")
public class DestinoController {

    @Autowired
    private DestinoRepository repository;

    @GetMapping
    public List<Destino> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Destino criar(@RequestBody Destino destino) {
        return repository.save(destino);
    }

    @GetMapping("/{id}")
    public Destino buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}