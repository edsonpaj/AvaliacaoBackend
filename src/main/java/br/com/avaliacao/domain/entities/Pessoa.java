package br.com.avaliacao.domain.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

@Entity
@SequenceGenerator(name = Pessoa.SEQUENCE_GEN, sequenceName = Pessoa.SEQUENCE_NAME, initialValue = 1, allocationSize = 1)
@Table(name = Pessoa.TABLE_NAME)
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1860169613367515439L;

	public static final String TABLE_NAME = "tb_pessoa";
	public static final String SEQUENCE_GEN = "gen_pessoa";
	public static final String SEQUENCE_NAME = "sq_tb_pessoa";
	
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private Date dataNascimento;
	private String fotoBase64;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_GEN)
	@Column(name = "id_pessoa", columnDefinition = "integer", unique = true, nullable = false)
	@NotNull
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "ds_nome", nullable = false, length = 250)
	@NotNull
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name = "ds_cpf", unique = true, nullable = false, length = 11)
	@NotNull
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Column(name = "ds_email", nullable = false, length = 100)
	@NotNull
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_nascimento")
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Column(name = "ds_foto_base64")
	public String getFotoBase64() {
		return fotoBase64;
	}
	public void setFotoBase64(String fotoBase64) {
		this.fotoBase64 = fotoBase64;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		if (getId() != null) {
			return getId().hashCode();
		} else {
			return super.hashCode();
		}
	}

	@Override
	public String toString() {
		return getClass().getName() + "[id = " + getId() + "]";
	}
}
