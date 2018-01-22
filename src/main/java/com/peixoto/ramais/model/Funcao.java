package com.peixoto.ramais.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "funcao")
public class Funcao implements Serializable{
	
	private static final long serialVersionUID = 787878L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(targetEntity=Pessoa.class, mappedBy= "funcao")
	@Column(name = "idfunc")
	private Integer idFunc;
	
	
	@Column(name = "nomefuncao")
	@NotBlank
	private String nomeFunc;
	
	
	public Integer getIdFunc() {
		return idFunc;
	}
	public void setIdFunc(Integer idFunc) {
		this.idFunc = idFunc;
	}
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	
	
}
