package com.locadoraAutomoveis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "automovel", orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Locacao> locacoes;
}
