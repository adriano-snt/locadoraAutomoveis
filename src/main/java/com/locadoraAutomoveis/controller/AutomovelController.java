package com.locadoraAutomoveis.controller;

import com.locadoraAutomoveis.model.Automovel;
import com.locadoraAutomoveis.service.AutomovelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automovel")
@Api(value = "Automovel")
public class AutomovelController {

    @Autowired
    private AutomovelService automovelService;

    @ApiOperation(value = "Cadastra automovel")
    @PostMapping
    public ResponseEntity<Automovel> cadastrarAutomovel(@RequestBody Automovel automovel) {
        automovelService.save(automovel);
        return new ResponseEntity<>(automovel, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Retorna uma lista de Automovel")
    @GetMapping
    public List<Automovel> mostrarAutomoveis() {
        return automovelService.findAll();
    }
}
