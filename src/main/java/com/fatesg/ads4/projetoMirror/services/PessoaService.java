package com.fatesg.ads4.projetoMirror.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.Feedback;
import com.fatesg.ads4.projetoMirror.domain.Pessoa;
import com.fatesg.ads4.projetoMirror.repositories.PessoaRepository;
import com.fatesg.ads4.projetoMirror.services.exceptions.DataIntegrityException;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repositorio;
	
	//BUSCA UMA PESSOA POR ID
	public Pessoa buscarId(Integer id) {
		
		Optional<Pessoa> pessoa = repositorio.findById(id);
		
		return pessoa.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Pessoa.class.getName(), null));
		
	}
	
	//LISTA TODAS AS PESSOAS
	public List<Pessoa> buscarTudo(){
		
		return repositorio.findAll();
		
	}
	
	//LISTA TODOS OS FEEDBACKS DAQUELA PESSOA
	public List<Feedback> listaFeedbacks(Integer id){
		
		Optional<Pessoa> pessoa = repositorio.findById(id);
		
		return pessoa.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Pessoa.class.getName(), null)).getFeedbacks();
		
	}
	
	//INSERIR UMA PESSOA
	public void inserir(Pessoa pessoa) {
		
		repositorio.save(pessoa);
		
	}
	
	//ATUALIZA UMA PESSOA
	public Pessoa atualizar(Pessoa pessoa) {
		
		buscarId(pessoa.getId());
		return repositorio.save(pessoa);
		
	}
	
	
	//DELETA UMA PESSOA
	public void deletePorId(Integer id) {
		buscarId(id);
		try {
			repositorio.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir um usuário vinculado a um Feedback!");
		}

	}
	
}