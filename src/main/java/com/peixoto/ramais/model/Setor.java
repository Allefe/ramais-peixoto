/*
package com.peixoto.ramais.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "setor")
public class Setor implements Serializable{

	private static final long serialVersionUID = -4058947309651796481L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idset")
	private Integer idSetor;
	
	@Column(name = "setor")
	@NotBlank
	private Integer numSetor;
	
	
	public Integer getIdSetor() {
		return idSetor;
	}
	public void setIdSetor(Integer idSetor) {
		this.idSetor = idSetor;
	}
	public Integer getNomeSetor() {
		return numSetor;
	}
	public void setNomeSetor(Integer nomeSetor) {
		this.numSetor = nomeSetor;
	}
	
	
}*/
