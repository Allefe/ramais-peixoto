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
@Table(name = "filial")
public class Filial implements Serializable {
	
	private static final long serialVersionUID = 3981785752608496340L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idfilial")
	private Integer idFilial;
	
	@Column(name = "nomefilial")
	@NotBlank
	private String nomeFilial;
	
	
	public Integer getIdFilial() {
		return idFilial;
	}
	public void setIdFilial(Integer idFilial) {
		this.idFilial = idFilial;
	}
	public String getNomeFilial() {
		return nomeFilial;
	}
	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}
	
	
}
