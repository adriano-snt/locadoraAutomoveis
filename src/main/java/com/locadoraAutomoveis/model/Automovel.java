package com.locadoraAutomoveis.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoAutomovel;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private String cor;

    @Column
    private BigDecimal kilometragemTotal;

    @Column
    private LocalDateTime created_at;
}
