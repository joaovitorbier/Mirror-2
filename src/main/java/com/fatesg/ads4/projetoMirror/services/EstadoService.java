package com.fatesg.ads4.projetoMirror.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.Estado;
import com.fatesg.ads4.projetoMirror.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;
	
	//Busca um estado por ID
	public Estado buscarId(Integer id) {
		
		Optional<Estado> objeto = repository.findById(id);
		
		return objeto.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName(), null));
		
	}
	
	//Busca TODOS estados
	public List<Estado> buscarTudo() {
		return repository.findAll();
	}
	
}