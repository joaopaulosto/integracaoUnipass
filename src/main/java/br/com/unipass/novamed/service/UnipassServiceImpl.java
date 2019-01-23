package br.com.unipass.novamed.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unipass.novamed.config.ApplicationConfig;
import br.com.unipass.novamed.exception.BussinessException;
import br.com.unipass.novamed.util.LoggerUtils;
import br.com.unipass.novamed.util.MessagesUtil;
import br.com.unipass.novamed.ws.domain.DomainWSImpl;
import br.com.unipass.novamed.ws.domain.ValidateUnipassResponse;
import br.com.unipass.novamed.ws.domain.WebServiceException;

@Service
public class UnipassServiceImpl implements UnipassService {

	@Autowired
	private DomainWSImpl unipassDomainWS;

	@Autowired
	private ApplicationConfig appConfig;

	@Autowired
	private MessagesUtil messages;

	@Override
	public String validateUnipass(String unipass, String ip) {
		ValidateUnipassResponse r;
		Integer codDominio = Integer.parseInt(this.appConfig.getDomainCodeUnipass());
		try {
			r = unipassDomainWS.validateUnipass(ip, codDominio, unipass);
			if (r != null && r.getReturnCode() != 0) {
				LoggerUtils.logDebug(this.getClass(), "Frase: {}, ReturnCode: {}, Message: {}", unipass,
						r.getReturnCode(), r.getReturnMessage());
				return r.getReturnMessage();
			}
		} catch (WebServiceException e) {
			LoggerUtils.logError(this.getClass(), "Erro ao validar o Unipass: '{}'", unipass, e);
			return "Unipass Inválido";
		}
		return null;
	}

	@Override
	public void registerUserInDomain(String unipass, String userName, String ip) throws Exception {

		ValidateUnipassResponse responseUnipass = unipassDomainWS.registerUserInDomain(ip,
				Integer.parseInt(appConfig.getDomainCodeUnipass()), unipass, userName, StringUtils.EMPTY);
		if (responseUnipass != null && responseUnipass.getReturnCode() == 0) {
			// responseUnipass.getData().getRelationshipId();
			// httpServletRequest.getSession().setAttribute(usuarioDto.getFraseUnipass(),
			// relationshipId);
			// usuarioDto.setIdRelacionamentoUnipass(Long.parseLong(relationshipId));
		} else {
			String msg;
			switch (responseUnipass.getReturnCode()) {
			case -4:
				msg = responseUnipass.getReturnMessage();
				break;
			case -137:
				msg = messages.get("user.already.registred");
				break;
			default:
				msg = messages.get("error.register.user");				
			}
			LoggerUtils.logError(this.getClass(), "Erro ao registrar Unipass: '{}', Retorno: '{}'", unipass,
					responseUnipass.getReturnCode());
			throw new BussinessException(msg);
		}
	}

}
