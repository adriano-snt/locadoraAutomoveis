package com.locadoraAutomoveis.service.impl;

import com.locadoraAutomoveis.model.Locacao;
import com.locadoraAutomoveis.repository.LocacaoRepository;
import com.locadoraAutomoveis.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocacaoServiceImpl implements LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @Override
    public void save(Locacao locacao) {
        locacaoRepository.save(locacao);
    }

    @Override
    public List<Locacao> findAll() {
        return locacaoRepository.findAll();
    }

    @Override
    public void deleteBy(Integer id) { locacaoRepository.deleteById(id);}

}
