package br.com.unipass.novamed.entity;

public class UnipassFrom {
	
	private String unipass;
	
	private String url;

	private String ticket;
	
	private String mensagem;
	
	public UnipassFrom(String ticket) {
		this.ticket = ticket;
	}
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String id) {
		this.ticket = id;
	}

	public void setUnipass(String unipass) {
		this.unipass = unipass;
	}
	
	public String getUnipass() {
		return unipass;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}

}
