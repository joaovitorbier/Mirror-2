package com.fatesg.ads4.projetoMirror.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatesg.ads4.projetoMirror.domain.Cidade;
import com.fatesg.ads4.projetoMirror.services.CidadeService;

@RestController
@RequestMapping(value="/cidades")
public class CidadeResources {
	
	@Autowired
	private CidadeService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cidade> buscarCidade(@PathVariable Integer id) {
		
		Cidade cidade = service.buscarId(id);
		
		return ResponseEntity.ok().body(cidade);
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cidade>> buscarTudo() {
		
		List<Cidade> cidades = service.buscarTudo();
		
		return ResponseEntity.ok().body(cidades);
		
	}
	
	//ATÉ SEGUNDA
	@RequestMapping(value="/{Cidade}", method=RequestMethod.POST)
	public void salvar(@PathVariable Cidade cidade) {
		
		
		
	}

}