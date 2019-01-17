package br.com.unipass.novamed.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unipass.novamed.config.ApplicationConfig;
import br.com.unipass.novamed.exception.BussinessException;
import br.com.unipass.novamed.ws.domain.DomainWSImpl;
import br.com.unipass.novamed.ws.domain.ValidateUnipassResponse;
import br.com.unipass.novamed.ws.domain.WebServiceException;

@Service
public class UnipassServiceImpl implements UnipassService {

	@Autowired
	private DomainWSImpl unipassDomainWS;

	@Autowired
	private ApplicationConfig appConfig;

	@Override
	public String validateUnipass(String unipass, String ip) {
		ValidateUnipassResponse r;
		Integer codDominio = Integer.parseInt(this.appConfig.getDomainCodeUnipass());
		try {
			r = unipassDomainWS.validateUnipass(ip, codDominio, unipass);
			if (r != null && r.getReturnCode() != 0) {
				System.out.println(r.getReturnMessage());
				return r.getReturnMessage();
			}
		} catch (WebServiceException e) {
			System.out.println(e.getMessage());
			return "Unipass Inválido";
		}
		return null;
	}

	@Override
	public void registerUserInDomain(String unipass, String userName, String ip) throws Exception {
		
		ValidateUnipassResponse responseUnipass = unipassDomainWS.registerUserInDomain(ip, Integer.parseInt(appConfig.getDomainCodeUnipass()), 
				unipass, userName, StringUtils.EMPTY);
		if (responseUnipass != null && responseUnipass.getReturnCode() == 0) {
			//responseUnipass.getData().getRelationshipId();
			//httpServletRequest.getSession().setAttribute(usuarioDto.getFraseUnipass(), relationshipId);
			//usuarioDto.setIdRelacionamentoUnipass(Long.parseLong(relationshipId));
		}else {
			throw new BussinessException(responseUnipass.getReturnMessage());
		}
	}

}
