package com.locadoraAutomoveis.service.cliente.impl;

import com.locadoraAutomoveis.model.Cliente;
import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteGroupService implements DefaultGroupSequenceProvider<Cliente> {
    @Override
    public List<Class<?>> getValidationGroups(Cliente cliente) {
       List<Class<?>> groups = new ArrayList<>();
       groups.add(Cliente.class);

       if (pessoaSelecionada(cliente)) {
           groups.add(cliente.getTipoCliente().getGroup());
       }
       return groups;
    }

    private boolean pessoaSelecionada(Cliente cliente) {
        return cliente != null && cliente.getTipoCliente() != null;
    }
}
