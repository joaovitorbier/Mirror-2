package com.fatesg.ads4.projetoMirror.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fatesg.ads4.projetoMirror.domain.Cargo;
import com.fatesg.ads4.projetoMirror.services.CargoService;

@RestController
@RequestMapping(value = "/cargos")
public class CargoResources {

	@Autowired
	CargoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cargo> buscar(@PathVariable Integer id) {
		
		Cargo cargo = service.buscarId(id);
		
		return ResponseEntity.ok().body(cargo);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cargo>> buscarTudo(){
		
		List<Cargo> cargos = service.buscarTudo();
		
		return ResponseEntity.ok().body(cargos);
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> inserirCargo(@RequestBody Cargo cargo){
		
		service.inserirCargo(cargo);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cargo.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
		
	}
	
	@RequestMapping(value="{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizarCargo(@RequestBody Cargo cargo, @PathVariable Integer id){
		
		cargo.setId(id);
		service.atualizarCargo(cargo);
		
		return ResponseEntity.noContent().build();
		
	}
	
}