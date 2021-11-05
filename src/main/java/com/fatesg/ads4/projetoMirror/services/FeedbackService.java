package com.fatesg.ads4.projetoMirror.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.Feedback;
import com.fatesg.ads4.projetoMirror.repositories.FeedbackRepository;
import com.fatesg.ads4.projetoMirror.services.exceptions.DataIntegrityException;
import com.fatesg.ads4.projetoMirror.services.exceptions.ObjectNotFoundException;

@Service
public class FeedbackService{

	@Autowired
	FeedbackRepository repositorio;
	
	//Buscar Feedback
	public Feedback buscarId(Integer id) {
		
		Optional<Feedback> obj = repositorio.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Feedback.class.getName(), null));
		
	}
	
	//Lista todos feedbacks
	public List<Feedback> buscarTudo(){
		
		return repositorio.findAll();
		
	}
	
	//Insere um Feedback
	public void inserirFeedback(Feedback feedback) {
		
		repositorio.save(feedback);
		
	}
	
	//NUNCA VAI SER USADO I GUESS?
	//Deleta um feedback
	public void deletePorId(Integer id) {
		buscarId(id);
		try {
			repositorio.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir um Feedback vinculado a usuários!");
		}

	}
	
}
