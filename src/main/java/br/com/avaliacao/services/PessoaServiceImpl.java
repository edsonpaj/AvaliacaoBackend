package br.com.avaliacao.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;

import br.com.avaliacao.domain.dto.PessoaDTO;
import br.com.avaliacao.domain.entities.Pessoa;
import br.com.avaliacao.mapper.PessoaMapper;
import br.com.avaliacao.repository.PessoaRepository;
import br.com.avaliacao.util.CpfUtil;
import br.com.avaliacao.util.EmailUtil;

@Service
public class PessoaServiceImpl implements PessoaService, Serializable {

	private static final long serialVersionUID = 1218474898031649591L;
	
	@Autowired private PessoaMapper mapper;
	@Autowired private PessoaRepository repository;

	@Override
	public PessoaDTO save(PessoaDTO dto) {
		
		dto.setCpf(CpfUtil.removerMascara(dto.getCpf()));
		Preconditions.checkArgument(CpfUtil.cpfValido(dto.getCpf()), "O CPF informado não é válido!");

		Preconditions.checkArgument(EmailUtil.emailValido(dto.getEmail()), "O Email informado não é válido!");

		Pessoa p = mapper.toEntity(dto);
		p.setAtivo(Boolean.TRUE);
		p = repository.save(p);
		return mapper.toDTO(p);
	}
	
	@Override
	public PessoaDTO inative(Integer id) {
		Pessoa p = repository.findById(id).get();
		p.setAtivo(Boolean.FALSE);
		p = repository.save(p);
		return mapper.toDTO(p);
	}
	
	@Override
	public List<PessoaDTO> getAll() {
		return mapper.toListOfPessoaDTO(repository.findAllByAtivoOrderByIdDesc(Boolean.TRUE));
	}
	
	@Override
	public Boolean delete(Integer id) {
		repository.delete(repository.findById(id).get());
		return Boolean.TRUE;
	}

}
