package com.locadoraAutomoveis.repository;

import com.locadoraAutomoveis.model.Automovel;
import com.locadoraAutomoveis.service.AutomovelService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovelRepository extends JpaRepository<Automovel, Integer> {
}
