package com.fatesg.ads4.projetoMirror;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoMirrorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoMirrorApplication.class, args);

	}
	/*
	@Bean
	public boolean instanciaBancoDados() throws ParseException {
		dbService.instanciarBaseDados();
		return true;
		}
	*/
	@Override
	public void run(String... args) throws Exception {
		
		
	}

	
}
