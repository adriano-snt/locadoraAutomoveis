package com.locadoraAutomoveis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Automovel {
    @Id
    @Column(name = "automovel_Id")
    private Integer automovelId;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private String cor;

    @Column
    private Integer kilometragemTotal;

    @Column
    private LocalDateTime created_at;

    @Column
    private LocalDateTime updated_at;
}
