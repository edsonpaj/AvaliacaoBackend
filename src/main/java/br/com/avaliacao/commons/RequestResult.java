package br.com.avaliacao.commons;

import br.com.avaliacao.enums.RequestResultEnum;

public class RequestResult {
	
	private RequestResultEnum result;
	private String messageError;
	private Object returnObject;
	
	public RequestResult() {}
	
	public RequestResult(RequestResultEnum result, String messageError, Object returnObject) {
		this.result = result;
		this.messageError = messageError;
		this.returnObject = returnObject;
	}


	public RequestResultEnum getResult() {
		return result;
	}


	public void setResult(RequestResultEnum result) {
		this.result = result;
	}


	public String getMessageError() {
		return messageError;
	}


	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}


	public Object getReturnObject() {
		return returnObject;
	}


	public void setReturnObject(Object returnObject) {
		this.returnObject = returnObject;
	}
	
}
