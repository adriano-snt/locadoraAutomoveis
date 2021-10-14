package com.locadoraAutomoveis.repository;

import com.locadoraAutomoveis.model.Automovel;
import com.locadoraAutomoveis.service.AutomovelService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, Integer> {
}
