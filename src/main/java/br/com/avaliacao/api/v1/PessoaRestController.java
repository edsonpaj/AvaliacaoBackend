package br.com.avaliacao.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.avaliacao.commons.RequestResult;
import br.com.avaliacao.domain.dto.PessoaDTO;
import br.com.avaliacao.enums.RequestResultEnum;
import br.com.avaliacao.services.PessoaService;

@RestController
@RequestMapping(path = "/pessoa")
@CrossOrigin(origins = "http://localhost:4200")
public class PessoaRestController {
	
	@Autowired private PessoaService pessoaService;

	/**
	 * Salva uma nova pessoa
	 * @param dto
	 * @return
	 */
	@PostMapping
	public RequestResult save(@RequestBody PessoaDTO dto) {
		RequestResult result;
		try {
			result = new RequestResult(RequestResultEnum.OK, null, pessoaService.save(dto));
		} catch (Exception e) {
			result =  new RequestResult(RequestResultEnum.ER, e.getMessage(), null);
		}
		return result;
	}
	
	
	/**
	 * Retorna todas as pessoas dos sistema sem filtros.
	 * Menos performático a depender do volume de dados.
	 * Usando esta API terá que fazer a paginação no frontend.
	 * @return
	 */
	@GetMapping
	public RequestResult getAll() {
		RequestResult result;
		try {
			result = new RequestResult(RequestResultEnum.OK, null, pessoaService.getAll());
		} catch (Exception e) {
			result =  new RequestResult(RequestResultEnum.ER, e.getMessage(), null);
		}
		return result;
	}
	
	
	
}
