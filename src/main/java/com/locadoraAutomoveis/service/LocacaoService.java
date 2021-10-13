package com.locadoraAutomoveis.service;

import com.locadoraAutomoveis.model.Locacao;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LocacaoService {

    void save(Locacao locacao);

    List<Locacao> findAll();

    void deleteBy(Integer id);

}
