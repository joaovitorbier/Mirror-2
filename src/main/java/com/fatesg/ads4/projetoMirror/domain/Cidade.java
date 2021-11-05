package com.fatesg.ads4.projetoMirror.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;

	//CONSTRUTORES
	public Cidade() {
		super();
	}

	public Cidade(String descricao, Estado estado) {
		super();
		this.id = null;
		this.descricao = descricao;
		this.estado = estado;
	}
	
	//GETTERS E SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
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
		Cidade other = (Cidade) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", descricao=" + descricao + ", estado=" + estado + "]";
	}
	
}