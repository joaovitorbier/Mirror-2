package com.fatesg.ads4.projetoMirror.enumeradores;

public enum Perfil {

	USUARIO("USUARIO"),SUPERVISOR("SUPERVISOR"),ADMINISTRADOR("ADMINISTRADOR");
	
	private String descricao;

    Perfil(String descricaoFuncioario) {
        descricao = descricaoFuncioario;
    }

    public String getDescricao() {
        return descricao;
    }
	
}