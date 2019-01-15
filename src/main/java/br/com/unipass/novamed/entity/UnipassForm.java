package br.com.unipass.novamed.entity;

import java.io.Serializable;

public class UnipassForm  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String unipass;
	
	private String url;

	private String ticket;
	
	private String mensagem;
	
	private String ip;
	
	private String userName;
	
	public UnipassForm(String ticket) {
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
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}

}
