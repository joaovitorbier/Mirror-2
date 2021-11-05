package com.fatesg.ads4.projetoMirror.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatesg.ads4.projetoMirror.domain.Unidade;
import com.fatesg.ads4.projetoMirror.services.UnidadeService;

@RestController
@RequestMapping(value = "/unidades")
public class UnidadeResources {
	
	@Autowired
	UnidadeService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Unidade> buscarUnidade(@PathVariable Integer id){
		
		Unidade unidade = service.buscarId(id);
		
		return ResponseEntity.ok().body(unidade);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Unidade>> buscarTudo(){
		
		List<Unidade> unidades = service.buscarTudo();
		
		return ResponseEntity.ok().body(unidades);
		
	}
	

}
