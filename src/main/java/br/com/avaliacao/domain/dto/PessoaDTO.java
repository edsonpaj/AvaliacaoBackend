package br.com.avaliacao.domain.dto;

import java.util.Date;

public class PessoaDTO {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private Date dataNascimento;
	private String fotoBase64;
	
	public PessoaDTO() {}
	
	public PessoaDTO(String nome, String cpf, String email, Date dataNascimento, String fotoBase64) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.fotoBase64 = fotoBase64;
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
	public String getFotoBase64() {
		return fotoBase64;
	}
	public void setFotoBase64(String fotoBase64) {
		this.fotoBase64 = fotoBase64;
	}

}
