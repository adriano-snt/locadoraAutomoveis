package com.locadoraAutomoveis.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
    @Id
    @Column(name = "cliente_id", unique = true)
    private Integer clienteId;

    @Column
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String cpf;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco")
    @JsonBackReference
    private Endereco endereco;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updateAt;


    @OneToMany(mappedBy = "cliente", orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Locacao> locacoes;
}
