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
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int numero;
	private String logradouro;
	private String complemento;
	private String cep;
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;

	//CONSTRUTORES
	public Endereco(int numero, String logradouro, String complemento, String cep, String bairro,
			Cidade cidade) {
		super();
		this.id = null;
		this.numero = numero;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco() {
		super();
	}

	//GETTERS E SETTERS
	public Integer getId() {
		return id;
	}

	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, complemento, id, logradouro, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(complemento, other.complemento)
				&& Objects.equals(id, other.id) && Objects.equals(logradouro, other.logradouro)
				&& numero == other.numero;
	}
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", complemento=" + complemento + ", cep=" + cep
				+ ", bairro=" + bairro + ", numero=" + numero + ", cidade=" + cidade + "]";
	}
	
}