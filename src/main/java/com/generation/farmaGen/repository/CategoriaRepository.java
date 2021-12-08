package com.generation.farmaGen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmaGen.models.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long>{
	 public List<CategoriaModel> findAllByDescricaoCatContainingIgnoreCase(String descricaoCat);

}
