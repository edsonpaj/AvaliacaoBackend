package br.com.avaliacao.services;

import java.io.Serializable;
import java.util.List;

import br.com.avaliacao.domain.dto.PessoaDTO;

public interface PessoaService extends Serializable {

	public PessoaDTO save(PessoaDTO dto);

	public List<PessoaDTO> getAll();

}
