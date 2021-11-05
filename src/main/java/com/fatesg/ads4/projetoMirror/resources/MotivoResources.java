package com.fatesg.ads4.projetoMirror.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatesg.ads4.projetoMirror.domain.Motivo;
import com.fatesg.ads4.projetoMirror.services.MotivoService;

@RestController
@RequestMapping(value = "/motivos")
public class MotivoResources {

	@Autowired
	private MotivoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Motivo> buscarMotivo(@PathVariable Integer id) {
		
		Motivo motivo = service.buscarId(id);
		
		return ResponseEntity.ok().body(motivo);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Motivo>> buscarTudo() {
		
		List<Motivo> list = service.buscarTudo();
		
		return ResponseEntity.ok().body(list);
		
	}
	
}
