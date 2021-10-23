package com.locadoraAutomoveis.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locacaoId;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "automovel")
    @JsonIgnore
    private Automovel automovel;


    @Column(name = "kilometros_da_locacao")
    private Integer kilometrosDaLocacao;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy:HH:mm:ss")
    @CreationTimestamp
    @Column(name = "data_locacao", nullable = false, updatable = false)
    private LocalDateTime dataLocacao;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    @JsonIgnore
    private Cliente cliente;
}
