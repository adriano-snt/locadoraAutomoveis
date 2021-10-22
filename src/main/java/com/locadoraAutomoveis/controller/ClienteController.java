package com.locadoraAutomoveis.controller;

import com.locadoraAutomoveis.model.Cliente;
import com.locadoraAutomoveis.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@Api(value = "Cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @ApiOperation(value = "Cadastra cliente")
    @PostMapping()
    public ResponseEntity<Cliente>  cadastrarCliente(@RequestBody Cliente cliente){
        clienteService.save(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Retorna uma lista de clientes")
    @GetMapping()
    public List<Cliente> mostrarCliente(){
       return clienteService.findAll();
    }

    @ApiOperation(value = "Deleta o cliente por um ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletarPorId(@PathVariable Integer id){
        clienteService.deleteBy(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @ApiOperation(value = "Atualiza dados de um cliente por ID")
    @PutMapping("/{id}")
    public ResponseEntity<Boolean> atualizarPorId(@PathVariable Integer id, @RequestBody Cliente cliente){
        clienteService.findBy(id);
        clienteService.save(cliente);
        return ResponseEntity.ok(Boolean.TRUE);

    }
}
