package com.locadoraAutomoveis.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.locadoraAutomoveis.enums.TipoCliente;
import com.locadoraAutomoveis.service.cliente.impl.ClienteGroupService;
import com.locadoraAutomoveis.service.cliente.interfaces.CnpjGroup;
import com.locadoraAutomoveis.service.cliente.interfaces.CpfGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.group.GroupSequenceProvider;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@GroupSequenceProvider(ClienteGroupService.class)
public class Cliente {
    @Id
    @Column(name = "cliente_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clienteId;

    @Column
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "tipo_cliente", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoCliente tipoCliente;

    @CPF(groups = CpfGroup.class, message = "CPF inválido!")
    @CNPJ(groups = CnpjGroup.class)
    @Column(name = "cpf_cnpj", unique = true)
    private String cpfOuCnpj;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco")
    @JsonBackReference
    private Endereco endereco;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy:HH:mm:ss")
    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy:HH:mm:ss")
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updateAt;


    @OneToMany(mappedBy = "cliente", orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Locacao> locacoes;
}
