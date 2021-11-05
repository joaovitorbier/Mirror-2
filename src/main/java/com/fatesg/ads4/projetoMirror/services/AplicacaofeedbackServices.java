package com.fatesg.ads4.projetoMirror.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.AplicacaoFeedback;
import com.fatesg.ads4.projetoMirror.domain.Feedback;
import com.fatesg.ads4.projetoMirror.repositories.AplicacaoFeedbackRepository;

@Service
public class AplicacaofeedbackServices {

	@Autowired
	AplicacaoFeedbackRepository repositorio;
	
	//Busca uma aplicação por ID
	public AplicacaoFeedback buscarId(Integer id) {
		
		Optional<AplicacaoFeedback> obj = repositorio.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + AplicacaoFeedback.class.getName(), null));
		
	}
	
	//Lista TODAS as aplicações de feedback
	public List<AplicacaoFeedback> buscarTudo(){
		
		return repositorio.findAll();
		
	}
	
	//Insere uma aplicacao de feedback
	//DISCUTIR A LÓGICA DISSO, SALVAR UMA APLICAÇÃO OU UMA APLICAÇÃO VINCULADA AO FEEDBACK?
	public void inserirFeedback(Feedback feedback) {
		
		AplicacaoFeedback aplicacao = feedback.getAplicacaoFeedback();
		
		repositorio.save(aplicacao);
		
	}
	
	//Update
	public AplicacaoFeedback atualizar(AplicacaoFeedback aplicacao) {
			
		buscarId(aplicacao.getId());
		return repositorio.save(aplicacao);
			
	}
		
}