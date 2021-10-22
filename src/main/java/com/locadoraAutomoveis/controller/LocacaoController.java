package com.locadoraAutomoveis.controller;


import com.locadoraAutomoveis.model.Locacao;
import com.locadoraAutomoveis.service.LocacaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locacao")
@Api(value = "Locacao")
public class LocacaoController {
    @Autowired
    private LocacaoService locacaoService;

    @ApiOperation(value = "Cadastra locacao")
    @PostMapping
    public ResponseEntity<Locacao> cadastrarLocacao(@RequestBody Locacao locacao){
        locacaoService.save(locacao);
        return new ResponseEntity<>(locacao, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Retorna uma lista de locacao cadastrada")
    @GetMapping
    public List<Locacao> mostrarLocacoes(){
        return locacaoService.findAll();
    }

    @ApiOperation(value = "Deleta uma locacao por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletarPorId(@PathVariable Integer id){
        locacaoService.deleteBy(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }


}
