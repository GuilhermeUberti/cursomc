package com.nelioalvez.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalvez.cursomc.domain.Categoria;
import com.nelioalvez.cursomc.repositories.CategoriaRepository;
import com.nelioalvez.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id 
				+ ", tipo: " + Categoria.class.getName()));
	}
}
