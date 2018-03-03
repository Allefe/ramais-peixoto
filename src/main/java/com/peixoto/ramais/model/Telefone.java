package com.peixoto.ramais.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {

	private static final long serialVersionUID = 6113633540612179168L;

	@Id
	@Column(name = "idtel")
	private Integer idTelefone;

	@Column(name = "numtel")
	private String numTelefoneContato;

	@ManyToOne
	@JoinColumn(name = "idemp", referencedColumnName = "idemp", foreignKey = @ForeignKey(name = "fk_telefoneEmpresa"))
	private Empresa empresa;

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	public String getNumTelefoneContato() {
		return numTelefoneContato;
	}

	public void setNumTelefoneContato(String numTelefoneContato) {
		this.numTelefoneContato = numTelefoneContato;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String toString() {
		return numTelefoneContato + "/" + " ";
	}

}
