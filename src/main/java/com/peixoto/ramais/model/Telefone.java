package com.peixoto.ramais.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

public class Telefone implements Serializable{
	
	private static final long serialVersionUID = 787878L;

	@ManyToOne(targetEntity = Telefone.class)
	@JoinColumn(name = "idTelelefone", referencedColumnName = "idtel", foreignKey = @ForeignKey(name = "fk_telefoneEmpresa"))
	@NotNull(message = "Telefone não informado!")
	@Column(name = "idtel")
	private Integer idTelefone;
	
	@Column(name = "numtel")
	private long numTelefoneContato;
	
	
	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	public long getNumTelefoneContato() {
		return numTelefoneContato;
	}
	public void setNumTelefoneContato(long numTelefoneContato) {
		this.numTelefoneContato = numTelefoneContato;
	}
	
	
	
	public String toString() {
		return numTelefoneContato + "/" + " ";
	}
	
}
