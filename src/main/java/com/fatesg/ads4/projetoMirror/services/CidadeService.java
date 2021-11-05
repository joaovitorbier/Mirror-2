package com.fatesg.ads4.projetoMirror.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.Cidade;
import com.fatesg.ads4.projetoMirror.repositories.CidadeRepository;
import com.fatesg.ads4.projetoMirror.services.exceptions.DataIntegrityException;
import com.fatesg.ads4.projetoMirror.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repositorio;
	
	//Busca uma cidade por ID
	public Cidade buscarId(Integer id){
		
		Optional<Cidade> obj = repositorio.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Cidade.class.getName(), null));
				
	}
	
	//Busca TODAS as cidades
	public List<Cidade> buscarTudo() {
		return repositorio.findAll();
	}
	
	//Insere uma cidade
	public void inserir(Cidade cidade) {
		
		repositorio.save(cidade);
		
	}
	
	//Atualiza os dados de uma cidade
	public Cidade atualizar(Cidade cidade) {
		
		buscarId(cidade.getId());
		return repositorio.save(cidade);
		
	}
	
	//Deleta uma cidade
	public void deletePorId(Integer id) {
		buscarId(id);
		try {
			repositorio.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir uma cidade vinculada a cadastros de usuários!");
		}

	}
	
}
