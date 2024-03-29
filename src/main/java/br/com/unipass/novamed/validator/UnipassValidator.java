package br.com.unipass.novamed.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import br.com.unipass.novamed.entity.UnipassForm;
import br.com.unipass.novamed.service.UnipassService;

@Component
public class UnipassValidator implements org.springframework.validation.Validator {

	@Autowired
	private UnipassService unipassService;

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
			String retorno = this.unipassService.validateUnipass(form.getUnipass(), form.getIp());
			if (!StringUtils.isEmpty(retorno)) {
				errors.rejectValue("unipass", "unipass.invalid");
				// ValidationUtils.rejectIfEmptyOrWhitespace(errors, "", retorno);
			}
		}
	}

}
