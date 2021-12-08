package com.fatesg.ads4.projetoMirror.resources;

//IMPORTEI STATIC PRA FICAR MAIS FÁCIL DE LER
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;

import io.restassured.http.ContentType;

@WebMvcTest
class CargoResourcesTest {

	
	@Autowired
	private CargoResources rest;
	
	@BeforeEach
	public void setUp(){
		
	}

	@Test
	public void testInsert_GET_returnSucess() {
		
		given(). //DADO
		accept(ContentType.JSON). //A INFORMAÇÃO DO CONTENTTYPE QUE É JSON
		when().get("/cargo/{id}", 1L). //QUANDO FAZ UM GET NO ENDPOINT /CARGOS
		then(). //ENTÃO
		statusCode(HttpStatus.OK.value()); //O STATUS CODE DEVE SER OK
		
	}

}