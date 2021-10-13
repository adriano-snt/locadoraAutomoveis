package com.locadoraAutomoveis.service;

import com.locadoraAutomoveis.model.Cliente;

import java.util.List;


public interface ClienteService {

   void save(Cliente cliente);

   List<Cliente> findAll ();

   void deleteBy(Integer id);

   void findBy(Integer id);
}
