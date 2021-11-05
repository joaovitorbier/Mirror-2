package com.fatesg.ads4.projetoMirror.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatesg.ads4.projetoMirror.domain.Estado;
import com.fatesg.ads4.projetoMirror.services.EstadoService;

@RestController
@RequestMapping(value="/estados")
public class EstadoResources {
	
	@Autowired
	private EstadoService service;
	
	// Listar estados por ID
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Estado> buscarPorId(@PathVariable Integer id) {
		
		Estado objeto = service.buscarId(id);
		
		return ResponseEntity.ok().body(objeto);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Estado>> buscarTudo() {
		
		List<Estado> estados = service.buscarTudo();
		
		return ResponseEntity.ok().body(estados);
		
	}

}
