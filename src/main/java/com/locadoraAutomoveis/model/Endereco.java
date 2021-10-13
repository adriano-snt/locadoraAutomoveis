package com.locadoraAutomoveis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco {
    @Id
    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column
    private String logradouro;

    @Column
    private Integer numero;

    @Column
    private String complemento;

    @Column
    private String cidade;

    @Column
    private String estado;
}
