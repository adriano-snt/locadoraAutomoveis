package com.locadoraAutomoveis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Locacao {
    @Id
    private Integer locacaoId;
    private Integer automovelId;
    private BigDecimal kimoletrosDaLocacao;
    private LocalDateTime dataLocacao;
}
