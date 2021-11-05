package com.fatesg.ads4.projetoMirror.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String uf;
	private String descricaoUf;

	@JsonIgnore
	@OneToMany(mappedBy = "estado")
	private List<Cidade> cidades = new ArrayList<>();

	//CONSTRUTORES
	public Estado() {

	}

	public Estado(String uf, String descricaoUf) {
		super();
		this.id = null;
		this.uf = uf;
		this.descricaoUf = descricaoUf;
	}

	//GETTERS E SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDescricaoUf() {
		return descricaoUf;
	}

	public void setDescricaoUf(String descricaoUf) {
		this.descricaoUf = descricaoUf;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}

}