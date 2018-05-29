package com.nelioalvez.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalvez.cursomc.domain.Categoria;
import com.nelioalvez.cursomc.repositories.CategoriaRepitory;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepitory repo;
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}

}
