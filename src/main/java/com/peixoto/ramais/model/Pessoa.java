package com.peixoto.ramais.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {
	

	private static final long serialVersionUID = 787878L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPessoa;
	
	@Column(name = "nomepes")
	@NotBlank
	private String nomePessoa;
	
	@Column(name = "ramalpes")
	@NotBlank
	private Integer ramalPessoa;
	
	@Column(name = "emailpes")
	@NotBlank
	private String emailPessoa;
	
	@Column(name = "telcorppes")
	private long telCorpPessoa;
	
	@Column(name = "tippes")
	private String tipoPessoa;
	
	@Column(name = "coddivpes")
	private Integer codDivPessoa;
	
	@Column(name = "codregpes")
	private Integer codRegPessoa;
	
	@Column(name = "codrcapes")
	private Integer codRcaPessoa;
	
	@Column(name = "cdprxpes")
	private String cdProxPessoa;
	
	
	@ManyToOne(targetEntity = Funcao.class)
	@JoinColumn(name = "idFunc", referencedColumnName = "idfunc", foreignKey = @ForeignKey(name = "fk_funcaoPessoa"))
	@NotNull(message = "Função não informada!")
	private Funcao funcao;
	
	@ManyToOne(targetEntity = Funcao.class)
	@JoinColumn(name = "idSetor", referencedColumnName = "idset", foreignKey = @ForeignKey(name = "fk_setorPessoa"))
	@NotNull(message = "Setor não informada!")
	private Setor setor;
	
	@ManyToOne(targetEntity = Funcao.class)
	@JoinColumn(name = "idEmpresa", referencedColumnName = "idemp", foreignKey = @ForeignKey(name = "fk_empresaPessoa"))
	@NotNull(message = "Empresa não informada!")
	private Empresa empresa;
	
	@ManyToOne(targetEntity = Funcao.class)
	@JoinColumn(name = "idFilial", referencedColumnName = "idfilial", foreignKey = @ForeignKey(name = "fk_filialPessoa"))
	@NotNull(message = "Filial não informada!")
	private Filial filial;
	
	
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public Integer getRamalPessoa() {
		return ramalPessoa;
	}
	public void setRamalPessoa(Integer ramalPessoa) {
		this.ramalPessoa = ramalPessoa;
	}
	public String getEmailPessoa() {
		return emailPessoa;
	}
	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}
	public long getTelCorpPessoa() {
		return telCorpPessoa;
	}
	public void setTelCorpPessoa(long telCorpPessoa) {
		this.telCorpPessoa = telCorpPessoa;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public Integer getCodDivPessoa() {
		return codDivPessoa;
	}
	public void setCodDivPessoa(Integer codDivPessoa) {
		this.codDivPessoa = codDivPessoa;
	}
	public Integer getCodRegPessoa() {
		return codRegPessoa;
	}
	public void setCodRegPessoa(Integer codRegPessoa) {
		this.codRegPessoa = codRegPessoa;
	}
	public Integer getCodRcaPessoa() {
		return codRcaPessoa;
	}
	public void setCodRcaPessoa(Integer codRcaPessoa) {
		this.codRcaPessoa = codRcaPessoa;
	}
	public String getCdProxPessoa() {
		return cdProxPessoa;
	}
	public void setCdProxPessoa(String cdProxPessoa) {
		this.cdProxPessoa = cdProxPessoa;
	}
	public Funcao getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	
	
	
}
