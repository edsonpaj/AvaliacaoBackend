package br.com.avaliacao.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avaliacao.domain.dto.PessoaDTO;
import br.com.avaliacao.domain.entities.Pessoa;
import br.com.avaliacao.mapper.PessoaMapper;
import br.com.avaliacao.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService, Serializable {

	private static final long serialVersionUID = 1218474898031649591L;
	
	@Autowired private PessoaMapper mapper;
	@Autowired private PessoaRepository repository;

	@Override
	public PessoaDTO save(PessoaDTO dto) {
		Pessoa p = mapper.toEntity(dto);
		p = repository.save(p);
		return mapper.toDTO(p);
	}

}