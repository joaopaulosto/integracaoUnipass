package br.com.unipass.novamed.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import br.com.unipass.novamed.entity.UnipassForm;
import br.com.unipass.novamed.ws.domain.DomainWSImpl;
import br.com.unipass.novamed.ws.domain.ValidateUnipassResponse;
import br.com.unipass.novamed.ws.domain.WebServiceException;

@Component
public class UnipassValidator implements org.springframework.validation.Validator {

	@Autowired
	private DomainWSImpl unipassDomainWS;

	@Override
	public boolean supports(Class<?> unipassForm) {

		return UnipassForm.class.isAssignableFrom(unipassForm);
	}

	@Override
	public void validate(Object obj, Errors errors) {

		UnipassForm form = (UnipassForm) obj;

		if (StringUtils.isEmpty(form.getUnipass())) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "unipass", "unipass.required");
		} else {

			String retorno = validateUnipass(form.getUnipass(), form.getIp());
			if (!StringUtils.isEmpty(retorno)) {		
				errors.rejectValue("unipass", "unipass.invalid");
				//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "", retorno);
			}
		}	
	}

	/**
	 * Valida o Unipass informado
	 * 
	 * @param unipass
	 * @param ip
	 * @return
	 */
	private String validateUnipass(String unipass, String ip) {
		ValidateUnipassResponse r;
		Integer codDominio = Integer.parseInt("1");
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

}
