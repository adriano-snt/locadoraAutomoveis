package com.locadoraAutomoveis.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Locacao {
    @Id
    @Column(name = "locacao_id")
    private Integer locacaoId;

<<<<<<< HEAD

    private String automovel_id;
=======
    private String automovel;
>>>>>>> main

    @Column(name = "kilometros_da_locacao")
    private Integer kilometrosDaLocacao;

    @Column(name = "data_locacao")
    private LocalDateTime dataLocacao;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    @JsonBackReference
    private Cliente cliente;
}
