package com.fatesg.ads4.projetoMirror.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.Cidade;
import com.fatesg.ads4.projetoMirror.domain.Estado;
import com.fatesg.ads4.projetoMirror.domain.Pessoa;
import com.fatesg.ads4.projetoMirror.repositories.CidadeRepository;
import com.fatesg.ads4.projetoMirror.repositories.EstadoRepository;

@Service
public class DBServices {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	PessoaService pessoaService;
	
	public void instanciarBaseDados() {

		
		
		Estado estado1 = new Estado("AC", "Acre");
		Estado estado2 = new Estado("AL", "Alagoas");
		Estado estado3 = new Estado("AP", "Amapá");
		Estado estado4 = new Estado("AM", "Amazonas");
		Estado estado5 = new Estado("BA", "Bahia");
		Estado estado6 = new Estado("CE", "Ceará");
		Estado estado7 = new Estado("DF", "Distrito Federal");
		Estado estado8 = new Estado("ES", "Espírito Santo");
		Estado estado9 = new Estado("GO", "Goiás");
		Estado estado10 = new Estado("MA", "Maranhão");
		Estado estado11 = new Estado("MT", "Mato Grosso");
		Estado estado12 = new Estado("MS", "Mato Grosso do Sul");
		Estado estado13 = new Estado("MG", "Minas Gerais");
		Estado estado14 = new Estado("PA", "Pará");
		Estado estado15 = new Estado("PB", "Paraíba");
		Estado estado16 = new Estado("PR", "Paraná");
		Estado estado17 = new Estado("PE", "Pernambuco");
		Estado estado18 = new Estado("PI", "Piauí");
		Estado estado19 = new Estado("RJ", "Rio de Janeiro");
		Estado estado20 = new Estado("RN", "Rio Grande do Norte");
		Estado estado21 = new Estado("RS", "Rio Grande do Sul");
		Estado estado22 = new Estado("RO", "Rondônia");
		Estado estado23 = new Estado("RR", "Roraima");
		Estado estado24 = new Estado("SC", "Santa Catarina");
		Estado estado25 = new Estado("SP", "São Paulo");
		Estado estado26 = new Estado("SE", "Sergipe");
		Estado estado27 = new Estado("TO", "Tocantins");

		Cidade cidade1 = new Cidade("Rio Branco", estado1);
		Cidade cidade2 = new Cidade("Acrêlandia", estado1);
		Cidade cidade3 = new Cidade("Maceio", estado2);
		Cidade cidade4 = new Cidade("Campo Alegre", estado2);
		Cidade cidade5 = new Cidade("Macapá", estado3);
		Cidade cidade6 = new Cidade("Aroeira", estado3);
		Cidade cidade7 = new Cidade("Manaus", estado4);
		Cidade cidade8 = new Cidade("Manauara", estado4);
		Cidade cidade9 = new Cidade("Salvador", estado5);
		Cidade cidade10 = new Cidade("Ilhéus", estado5);
		Cidade cidade11 = new Cidade("Fortaleza", estado6);
		Cidade cidade12 = new Cidade("Sobral", estado6);
		Cidade cidade13 = new Cidade("Brasilia", estado7);
		Cidade cidade14 = new Cidade("Asa Sul", estado7);
		Cidade cidade15 = new Cidade("Vitória", estado8);
		Cidade cidade16 = new Cidade("Colatina", estado8);
		Cidade cidade17 = new Cidade("Goiânia", estado9);
		Cidade cidade18 = new Cidade("Caldas Novas", estado9);
		Cidade cidade19 = new Cidade("São Luis", estado10);
		Cidade cidade20 = new Cidade("Tum Tum", estado10);
		Cidade cidade21 = new Cidade("Cuiabá", estado11);
		Cidade cidade22 = new Cidade("Sinop", estado11);
		Cidade cidade23 = new Cidade("Campo Grande", estado12);
		Cidade cidade24 = new Cidade("Corumbá", estado12);
		Cidade cidade25 = new Cidade("Belo Horizonte", estado13);
		Cidade cidade26 = new Cidade("Uberlandia", estado13);
		Cidade cidade27 = new Cidade("Belém", estado14);
		Cidade cidade28 = new Cidade("Rondon", estado14);
		Cidade cidade29 = new Cidade("João Pessoa", estado15);
		Cidade cidade30 = new Cidade("Patos", estado15);
		Cidade cidade31 = new Cidade("Curitiba", estado16);
		Cidade cidade32 = new Cidade("Londrina", estado16);
		Cidade cidade33 = new Cidade("Recife", estado17);
		Cidade cidade34 = new Cidade("Caruaru", estado17);
		Cidade cidade35 = new Cidade("Terezina", estado18);
		Cidade cidade36 = new Cidade("Floriano", estado18);
		Cidade cidade37 = new Cidade("Rio de Janeiro", estado19);
		Cidade cidade38 = new Cidade("Méier", estado19);
		Cidade cidade39 = new Cidade("Natal", estado20);
		Cidade cidade40 = new Cidade("Mossoró", estado20);
		Cidade cidade41 = new Cidade("Porto Alegre", estado21);
		Cidade cidade42 = new Cidade("Gramados", estado21);
		Cidade cidade43 = new Cidade("Porto Velho", estado22);
		Cidade cidade44 = new Cidade("Ariquemes", estado22);
		Cidade cidade45 = new Cidade("Boa Vista", estado23);
		Cidade cidade46 = new Cidade("Bonfim", estado23);
		Cidade cidade47 = new Cidade("Florianopolis", estado24);
		Cidade cidade48 = new Cidade("Balneario Camburiu", estado24);
		Cidade cidade49 = new Cidade("São Paulo", estado25);
		Cidade cidade50 = new Cidade("Ribeirão Preto", estado25);
		Cidade cidade51 = new Cidade("Aracaju", estado26);
		Cidade cidade52 = new Cidade("Praiana", estado26);
		Cidade cidade53 = new Cidade("Palmas", estado27);
		Cidade cidade54 = new Cidade("Taguatinga", estado27);

		estado1.getCidades().addAll(Arrays.asList(cidade1, cidade2));
		estado2.getCidades().addAll(Arrays.asList(cidade3, cidade4));
		estado3.getCidades().addAll(Arrays.asList(cidade5, cidade6));
		estado4.getCidades().addAll(Arrays.asList(cidade7, cidade8));
		estado5.getCidades().addAll(Arrays.asList(cidade9, cidade10));
		estado6.getCidades().addAll(Arrays.asList(cidade11, cidade12));
		estado7.getCidades().addAll(Arrays.asList(cidade13, cidade14));
		estado8.getCidades().addAll(Arrays.asList(cidade15, cidade16));
		estado9.getCidades().addAll(Arrays.asList(cidade17, cidade18));
		estado10.getCidades().addAll(Arrays.asList(cidade19, cidade20));
		estado11.getCidades().addAll(Arrays.asList(cidade21, cidade22));
		estado12.getCidades().addAll(Arrays.asList(cidade23, cidade24));
		estado13.getCidades().addAll(Arrays.asList(cidade25, cidade26));
		estado14.getCidades().addAll(Arrays.asList(cidade27, cidade28));
		estado15.getCidades().addAll(Arrays.asList(cidade29, cidade30));
		estado16.getCidades().addAll(Arrays.asList(cidade31, cidade32));
		estado17.getCidades().addAll(Arrays.asList(cidade33, cidade34));
		estado18.getCidades().addAll(Arrays.asList(cidade35, cidade36));
		estado19.getCidades().addAll(Arrays.asList(cidade37, cidade38));
		estado20.getCidades().addAll(Arrays.asList(cidade39, cidade40));
		estado21.getCidades().addAll(Arrays.asList(cidade41, cidade42));
		estado22.getCidades().addAll(Arrays.asList(cidade43, cidade44));
		estado23.getCidades().addAll(Arrays.asList(cidade45, cidade46));
		estado24.getCidades().addAll(Arrays.asList(cidade47, cidade48));
		estado25.getCidades().addAll(Arrays.asList(cidade49, cidade50));
		estado26.getCidades().addAll(Arrays.asList(cidade51, cidade52));
		estado27.getCidades().addAll(Arrays.asList(cidade53, cidade54));

		estadoRepository.saveAll(Arrays.asList(estado1, estado2, estado3, estado4, estado5, estado6, estado7, estado8,
				estado9, estado10, estado11, estado12, estado13, estado14, estado15, estado16, estado17, estado18,
				estado19, estado20, estado21, estado22, estado23, estado24, estado25, estado26, estado27));

		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3, cidade4, cidade5, cidade6, cidade7, cidade8,
				cidade9, cidade10, cidade11, cidade12, cidade13, cidade14, cidade15, cidade16, cidade17, cidade18,
				cidade19, cidade20, cidade21, cidade22, cidade23, cidade24, cidade25, cidade26, cidade27, cidade28,
				cidade29, cidade30, cidade31, cidade32, cidade33, cidade34, cidade35, cidade36, cidade37, cidade38,
				cidade39, cidade40, cidade41, cidade42, cidade43, cidade44, cidade45, cidade46, cidade47, cidade48,
				cidade49, cidade50, cidade51, cidade52, cidade53, cidade54));
		
		Pessoa pessoa = new Pessoa("Batata");

		pessoaService.inserir(pessoa);
		
	}

}