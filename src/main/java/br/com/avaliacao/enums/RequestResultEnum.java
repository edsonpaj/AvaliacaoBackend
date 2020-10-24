package br.com.avaliacao.enums;

public enum RequestResultEnum {
	
	OK("OK", 200), 
	ER("ERROR", 404);	
	
	private Integer resultCode;
	private String label;
	
	RequestResultEnum(String label, Integer resultCode) {
		this.label = label;
		this.resultCode = resultCode;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public Integer getResultCode() {
		return this.resultCode;
	}

}
