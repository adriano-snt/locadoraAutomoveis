package com.locadoraAutomoveis.service;

import com.locadoraAutomoveis.model.Automovel;

import java.util.List;

public interface AutomovelService {

    void save(Automovel automovel);

    List<Automovel> findAll();
}
