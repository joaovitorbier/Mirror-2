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
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Cidade cidade){
		
		service.inserir(cidade);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cidade.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
		
	}
	
	@RequestMapping(value="{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Cidade cidade, @PathVariable Integer id){
		
		cidade.setId(id);
		service.atualizar(cidade);
		
		return ResponseEntity.noContent().build();
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		
		service.deletePorId(id);
		
		return ResponseEntity.noContent().build();
		
	}

}