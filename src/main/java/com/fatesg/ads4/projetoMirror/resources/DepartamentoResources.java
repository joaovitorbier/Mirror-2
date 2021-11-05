package com.fatesg.ads4.projetoMirror.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatesg.ads4.projetoMirror.domain.Departamento;
import com.fatesg.ads4.projetoMirror.services.DepartamentoService;

@RestController
@RequestMapping(value="/departamentos")
public class DepartamentoResources {

	@Autowired
	private DepartamentoService service;
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<Departamento> buscarPorId(@PathVariable Integer id){
		
		Departamento departamento = service.buscarId(id);
		
		return ResponseEntity.ok().body(departamento);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Departamento>> buscarTudo() {
		
		List<Departamento> departamentos = service.buscarTudo();
		
		return ResponseEntity.ok().body(departamentos);
		
	}
	
}
