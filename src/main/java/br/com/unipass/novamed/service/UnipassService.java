package br.com.unipass.novamed.service;

public interface UnipassService {
		
	public String validateUnipass(String unipass, String ip);

	public void registerUserInDomain(String unipass, String userName, String ip) throws Exception;

}
