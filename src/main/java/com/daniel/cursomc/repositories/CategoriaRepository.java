package com.daniel.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.cursomc.domain.Categoria;

// Interface responsável pela camada de acesso a dados
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}
