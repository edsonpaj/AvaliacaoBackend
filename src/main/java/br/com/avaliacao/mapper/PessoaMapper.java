package br.com.avaliacao.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.avaliacao.domain.dto.PessoaDTO;
import br.com.avaliacao.domain.entities.Pessoa;

@Mapper(componentModel = "spring")
public interface PessoaMapper {
	
	public Pessoa toEntity(PessoaDTO dto);

	public PessoaDTO toDTO(Pessoa pessoa);

	public List<PessoaDTO> toListOfPessoaDTO(List<Pessoa> listOfPessoa);

}
