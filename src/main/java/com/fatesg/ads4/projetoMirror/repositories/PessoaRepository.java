package com.fatesg.ads4.projetoMirror.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.fatesg.ads4.projetoMirror.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	@Transactional(readOnly=true)
	Pessoa findByEmail(String email);
	
}
