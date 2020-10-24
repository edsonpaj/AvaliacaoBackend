package br.com.avaliacao.commons;

import br.com.avaliacao.enums.RequestResultEnum;

public class RequestResult {
	
	private RequestResultEnum result;
	private String messageError;
	private Object returnObject;
	
	
	public RequestResult(RequestResultEnum result, String messageError, Object returnObject) {
		this.result = result;
		this.messageError = messageError;
		this.returnObject = returnObject;
	}
	
}
