package br.com.unipass.novamed.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	
	
}
