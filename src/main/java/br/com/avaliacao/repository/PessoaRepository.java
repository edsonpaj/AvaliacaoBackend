package br.com.avaliacao.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.avaliacao.domain.entities.Pessoa;

@Repository
public interface PessoaRepository extends Serializable, JpaRepository<Pessoa, Integer>{
	
	public List<Pessoa> findAllByAtivoOrderByIdDesc(Boolean ativo);

}
