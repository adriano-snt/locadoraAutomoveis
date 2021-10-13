package com.locadoraAutomoveis.service.impl;

import com.locadoraAutomoveis.model.Automovel;
import com.locadoraAutomoveis.repository.AutomovelRepository;
import com.locadoraAutomoveis.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AutomovelServiceImpl implements AutomovelService {
    @Autowired
    private AutomovelRepository automovelRepository;

    @Override
    public void save(Automovel automovel) {
        automovelRepository.save(automovel);
    }

    @Override
    public List<Automovel> findAll() {
        return automovelRepository.findAll();
    }
}
