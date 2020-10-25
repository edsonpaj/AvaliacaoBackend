package br.com.avaliacao.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avaliacao.domain.dto.PessoaDTO;
import br.com.avaliacao.domain.entities.Pessoa;
import br.com.avaliacao.mapper.PessoaMapper;
import br.com.avaliacao.repository.PessoaRepository;
import br.com.avaliacao.util.CpfUtil;

@Service
public class PessoaServiceImpl implements PessoaService, Serializable {

	private static final long serialVersionUID = 1218474898031649591L;
	
	@Autowired private PessoaMapper mapper;
	@Autowired private PessoaRepository repository;

	@Override
	public PessoaDTO save(PessoaDTO dto) {
		if(!CpfUtil.cpfValido(dto.getCpf())) {
			throw new RuntimeException("O CPF informado não é válido!");
		} else {
			dto.setCpf(CpfUtil.removerMascara(dto.getCpf()));
		}
		Pessoa p = mapper.toEntity(dto);
		p = repository.save(p);
		return mapper.toDTO(p);
	}
	
	@Override
	public List<PessoaDTO> getAll() {
		return mapper.toListOfPessoaDTO(repository.findAll());
	}

}
