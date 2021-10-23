package com.locadoraAutomoveis.enums;

import com.locadoraAutomoveis.service.cliente.interfaces.CnpjGroup;
import com.locadoraAutomoveis.service.cliente.interfaces.CpfGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoCliente {
    FISICA("Fisica", "CPF", "000.000.000-00", CpfGroup.class),
    JURIDICA("Juridica", "CNPJ", "00.000.000/0000-00", CnpjGroup.class);

    private final String tipoPessoa;
    private final String documento;
    private final String mascara;
    private final Class<?> group;

}

