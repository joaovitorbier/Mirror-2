package com.fatesg.ads4.projetoMirror.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fatesg.ads4.projetoMirror.enumeradores.FeedBackStatus;

@Entity
public class Feedback implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//Pessoas a participarem da avaliação
	@OneToOne
	@JoinColumn
	private Pessoa avaliador;

	@OneToOne
	@JoinColumn
	private Pessoa avaliado;
	
	
	//Datas
	private Date dataCadastro;
	private Date dataAgendamento;
	
	@ManyToOne
	@JoinColumn
	private Motivo motivo;
	
	@OneToOne
	@JoinColumn
	private AplicacaoFeedback aplicacaoFeedback;
	
	private String anotacao;
	private FeedBackStatus status; //OS SEGUINTES STATUS: APLICADO, ATRASADO, 
	
	//CONSTRUTORES
	public Feedback() {
		super();
	}
	
	public Feedback(Pessoa avaliador, Pessoa avaliado,Date dataAgendamento, Motivo motivo,String anotacao) {
		super();
		this.id = null;
		this.avaliador = avaliador;
		this.avaliado = avaliado;
		this.dataAgendamento = dataAgendamento;
		this.motivo = motivo;
		this.anotacao = anotacao;
		
		setStatus(FeedBackStatus.PENDENTE);
		Date agora = new Date();
		this.dataCadastro = agora;
	}



	//GETTERS E SETTERS
	public Integer getId() {
		return id;
	}
	
	
	public AplicacaoFeedback getAplicacaoFeedback() {
		return aplicacaoFeedback;
	}

	public void setAplicacaoFeedback(AplicacaoFeedback aplicacaoFeedback) {
		this.aplicacaoFeedback = aplicacaoFeedback;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Pessoa getAvaliador() {
		return avaliador;
	}
	public void setAvaliador(Pessoa avaliador) {
		this.avaliador = avaliador;
	}
	public Pessoa getAvaliado() {
		return avaliado;
	}
	public void setAvaliado(Pessoa avaliado) {
		this.avaliado = avaliado;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
	public Motivo getMotivo() {
		return motivo;
	}
	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}
	public String getAnotacao() {
		return anotacao;
	}
	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}
	public FeedBackStatus getStatus() {
		return status;
	}
	public void setStatus(FeedBackStatus status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(anotacao, avaliado, avaliador, dataAgendamento, dataCadastro, id, motivo, status);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		return Objects.equals(anotacao, other.anotacao) && Objects.equals(avaliado, other.avaliado)
				&& Objects.equals(avaliador, other.avaliador) && Objects.equals(dataAgendamento, other.dataAgendamento)
				&& Objects.equals(dataCadastro, other.dataCadastro) && Objects.equals(id, other.id)
				&& Objects.equals(motivo, other.motivo) && status == other.status;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", avaliador=" + avaliador + ", avaliado=" + avaliado + ", dataCadastro="
				+ dataCadastro + ", dataAgendamento=" + dataAgendamento + ", motivo=" + motivo + ", anotacao="
				+ anotacao + ", status=" + status + "]";
	}
	
	
}