package com.locadoraAutomoveis.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
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


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "automovel")
    @JsonIgnore
    private Automovel automovel;


    @Column(name = "kilometros_da_locacao")
    private Integer kilometrosDaLocacao;

    @Column(name = "data_locacao")
    private LocalDateTime dataLocacao;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    @JsonIgnore
    private Cliente cliente;
}
