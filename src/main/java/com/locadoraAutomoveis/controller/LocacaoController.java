package com.locadoraAutomoveis.controller;


import com.locadoraAutomoveis.model.Locacao;
import com.locadoraAutomoveis.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {
    @Autowired
    private LocacaoService locacaoService;

    @PostMapping
    public ResponseEntity<Locacao> cadastrarLocacao(@RequestBody Locacao locacao){
        locacaoService.save(locacao);
        return new ResponseEntity<>(locacao, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Locacao> mostrarLocacoes(){
        return locacaoService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletarPorId(@PathVariable Integer id){
        locacaoService.deleteBy(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }


}
