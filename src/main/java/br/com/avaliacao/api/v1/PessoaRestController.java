package br.com.avaliacao.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
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
public class PessoaRestController {
	
	@Autowired private PessoaService pessoaService;

	@PostMapping
	public RequestResult save(@RequestBody PessoaDTO dto) {
		try {
			return new RequestResult(RequestResultEnum.OK, null, pessoaService.save(dto));
		} catch (Exception e) {
			return new RequestResult(RequestResultEnum.ER, e.getMessage(), null);
		}
	}
	
}
