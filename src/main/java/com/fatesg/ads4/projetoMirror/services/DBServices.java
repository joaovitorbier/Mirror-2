package com.fatesg.ads4.projetoMirror.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.Pessoa;
import com.fatesg.ads4.projetoMirror.enumeradores.Perfil;

@Service
public class DBServices {

	@Autowired
	PessoaService pessoaService;
	
	public void instanciarBaseDados() {
		
		//INSTANCIANDO UM ADMIN
		Pessoa pessoa = new Pessoa("admin@admin","admin");
		pessoa.addPerfil(Perfil.ADMIN);
		pessoaService.inserir(pessoa);
		
		//INSTANCIANDO UM AVALIADOR
		Pessoa pessoa2 = new Pessoa("avaliador@avaliador","avaliador");
		pessoa2.addPerfil(Perfil.AVALIADOR);
		pessoaService.inserir(pessoa2);
		
		//INSTANCIANDO UM USER
		Pessoa pessoa3 = new Pessoa("user@user","user");
		pessoaService.inserir(pessoa3);

		
	}

}