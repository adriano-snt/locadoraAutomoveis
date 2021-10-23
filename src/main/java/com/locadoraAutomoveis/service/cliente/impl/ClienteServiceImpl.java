package com.locadoraAutomoveis.service.cliente.impl;

import com.locadoraAutomoveis.Exception.ResourcesNotFoundException;
import com.locadoraAutomoveis.model.Cliente;
import com.locadoraAutomoveis.repository.ClienteRepository;
import com.locadoraAutomoveis.service.cliente.interfaces.ClienteService;
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
    public void deleteBy(Integer id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            throw new ResourcesNotFoundException();
        }


    }

    @Override
    public void findBy(Integer id) {
        clienteRepository.findById(id);
    }
}