package com.locadoraAutomoveis.service.impl;

import com.locadoraAutomoveis.model.Cliente;
import com.locadoraAutomoveis.repository.ClienteRepository;
import com.locadoraAutomoveis.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
      return clienteRepository.findAll();
    }

    @Override
    public void deleteBy(String id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void findBy(String id) {
        clienteRepository.findById(id);
    }

}