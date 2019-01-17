package br.com.unipass.novamed.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.unipass.novamed.entity.UnipassForm;

@Component
public class RegisterUnipassValidator implements Validator {

	@Override
	public boolean supports(Class<?> unipassForm) {
		return UnipassForm.class.isAssignableFrom(unipassForm);
	}

	@Override

	public void validate(Object obj, Errors errors) {
		UnipassForm form = (UnipassForm) obj;

		if (StringUtils.isEmpty(form.getUnipass())) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "unipass", "unipass.required");
		}
		
		if (StringUtils.isEmpty(form.getUserName())) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "username.required");
		}
		
		

	}

}
