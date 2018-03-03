package com.peixoto.ramais.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
	
	private static final long serialVersionUID = -6075979616115740003L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idemp")
	private Integer idEmpresa;
	
	@Column(name = "nomeemp")
	@NotBlank
	private String nomeEmpresa;
	
	@Column(name = "cidemp")
	private String endCidadeEmpresa;
	
	@Column(name = "bairemp")
	private String endBairroEmpresa;
	
	@Column(name = "estemp")
	private String endEstadoEmpresa;
	
	@Column(name = "endruanumemp")
	private String endRuaAveNumEmpresa;
	
	@Column(name = "emailemp")
	private String emailEmpresa;
	
	@Column(name = "ramalemp")
	private Integer ramalEmpresa;
	
	@Column(name = "siteemp")
	private String siteEmpresa;
	
	@Column(name = "ramoemp")
	private String ramoAtivEmpresa;
	
	@OneToMany(targetEntity = Telefone.class, mappedBy="empresa")
	private List <Telefone> telefone;
	
	@Column(name = "imagempath")
	private String logoEmpresaPath;
	
	@Column(name = "horafunciomamentoSegSex")
	private String funciomanentoSegSexta;
	
	public List<Telefone> getTelefone() {
		return telefone;
	}
	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}
	public String getFunciomanentoSegSexta() {
		return funciomanentoSegSexta;
	}
	public void setFunciomanentoSegSexta(String funciomanentoSegSexta) {
		this.funciomanentoSegSexta = funciomanentoSegSexta;
	}
	public String getFunciomanentoSabado() {
		return funciomanentoSabado;
	}
	public void setFunciomanentoSabado(String funciomanentoSabado) {
		this.funciomanentoSabado = funciomanentoSabado;
	}
	public String getFunciomanentoDomingo() {
		return funciomanentoDomingo;
	}
	public void setFunciomanentoDomingo(String funciomanentoDomingo) {
		this.funciomanentoDomingo = funciomanentoDomingo;
	}
	@Column(name = "horafunciomamentoSab")
	private String funciomanentoSabado;
	
	@Column(name = "horafunciomamentoDom")
	private String funciomanentoDomingo;
	
	public Integer getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getEndCidadeEmpresa() {
		return endCidadeEmpresa;
	}
	public void setEndCidadeEmpresa(String endCidadeEmpresa) {
		this.endCidadeEmpresa = endCidadeEmpresa;
	}
	public String getEndBairroEmpresa() {
		return endBairroEmpresa;
	}
	public void setEndBairroEmpresa(String endBairroEmpresa) {
		this.endBairroEmpresa = endBairroEmpresa;
	}
	public String getEndEstadoEmpresa() {
		return endEstadoEmpresa;
	}
	public void setEndEstadoEmpresa(String endEstadoEmpresa) {
		this.endEstadoEmpresa = endEstadoEmpresa;
	}
	public String getEndRuaAveNumEmpresa() {
		return endRuaAveNumEmpresa;
	}
	public void setEndRuaAveNumEmpresa(String endRuaAveNumEmpresa) {
		this.endRuaAveNumEmpresa = endRuaAveNumEmpresa;
	}
	public String getEmailEmpresa() {
		return emailEmpresa;
	}
	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}
	public Integer getRamalEmpresa() {
		return ramalEmpresa;
	}
	public void setRamalEmpresa(Integer ramalEmpresa) {
		this.ramalEmpresa = ramalEmpresa;
	}
	public String getSiteEmpresa() {
		return siteEmpresa;
	}
	public void setSiteEmpresa(String siteEmpresa) {
		this.siteEmpresa = siteEmpresa;
	}
	public String getRamoAtivEmpresa() {
		return ramoAtivEmpresa;
	}
	public void setRamoAtivEmpresa(String ramoAtivEmpresa) {
		this.ramoAtivEmpresa = ramoAtivEmpresa;
	}
	public List<Telefone> getTelefones() {
		return telefone;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefone = telefones;
	}
	public String getImagemPath() {
		return logoEmpresaPath;
	}
	public void setImagemPath(String logoEmpresaPath) {
		this.logoEmpresaPath = logoEmpresaPath;
	}
	

	
}
