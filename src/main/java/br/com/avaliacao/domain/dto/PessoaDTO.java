package br.com.avaliacao.domain.dto;

import java.util.Date;

public class PessoaDTO {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private Date dataNascimento;
	private String extencaoFoto;
	private byte[] conteudoFoto;
	
	public PessoaDTO() {}
	
	public PessoaDTO(String nome, String cpf, String email, Date dataNascimento,
					 String extencaoFoto, byte[] conteudoFoto) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.extencaoFoto = extencaoFoto;
		this.conteudoFoto = conteudoFoto;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getExtencaoFoto() {
		return extencaoFoto;
	}
	public void setExtencaoFoto(String extencaoFoto) {
		this.extencaoFoto = extencaoFoto;
	}
	public byte[] getConteudoFoto() {
		return conteudoFoto;
	}
	public void setConteudoFoto(byte[] conteudoFoto) {
		this.conteudoFoto = conteudoFoto;
	}
}
