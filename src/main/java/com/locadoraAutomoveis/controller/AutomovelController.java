package com.locadoraAutomoveis.controller;

import com.locadoraAutomoveis.model.Automovel;
import com.locadoraAutomoveis.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Automovel")
public class AutomovelController {

    @Autowired
    private AutomovelService automovelService;

    @PostMapping
    public ResponseEntity<Automovel> cadastrarAutomovel(@RequestBody Automovel automovel) {
        automovelService.save(automovel);
        return new ResponseEntity<>(automovel, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Automovel> mostrarAutomoveis() {
        return automovelService.findAll();
    }
}
