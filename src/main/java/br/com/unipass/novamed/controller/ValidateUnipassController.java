package br.com.unipass.novamed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipass.novamed.config.ApplicationConfig;
import br.com.unipass.novamed.entity.UnipassForm;
import br.com.unipass.novamed.util.Utils;
import br.com.unipass.novamed.validator.UnipassValidator;

@Controller
public class ValidateUnipassController {

	@Autowired
	private UnipassValidator unipassValidator;

	@Autowired
	private ApplicationConfig appConfig;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		// binder.setValidator(unipassValidator);
	}

	@GetMapping(value = "/index")
	public ModelAndView showForm(@RequestParam(value = "ticket", required = false) String ticket, Model model,
			HttpServletRequest request) {
		Utils.persisterTicket(ticket, request);
		return new ModelAndView("index", "unipassForm", new UnipassForm());
	}

	@GetMapping(value = "/")
	public ModelAndView showFormIndex() {
		return new ModelAndView("index", "unipassForm", new UnipassForm());
	}

	@PostMapping(value = "/validateUnipass")
	public ModelAndView submit(@RequestParam(value = "ticket", required = false) String ticket,
			@Valid @ModelAttribute("unipassForm") UnipassForm unipassForm, BindingResult result, ModelMap model,
			HttpServletRequest request) {

		// Seta o ip de cliente
		unipassForm.setIp(Utils.getRemoteIpAddress(request));

		unipassValidator.validate(unipassForm, result);

		if (result.hasErrors()) {
			unipassForm.setUnipass(StringUtils.EMPTY);
			return new ModelAndView("index", "unipassForm", unipassForm);
		} else {
			// unipassForm.setUrl(applicationConfig.getSuccessUrlRedirect());
			// return new ModelAndView("successUnipass", "unipassForm", unipassForm);
			return createRedirectExternalUrl(unipassForm, model, request);
		}
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.POST)
	public ModelAndView redirectUrl(@RequestParam(value = "ticket", required = false) String ticket,
			@Valid @ModelAttribute("unipassForm") UnipassForm unipassForm, BindingResult result, ModelMap model,
			HttpServletRequest request) {

		return createRedirectExternalUrl(unipassForm, model, request);
	}

	private ModelAndView createRedirectExternalUrl(UnipassForm unipassForm, ModelMap model,
			HttpServletRequest request) {

		String buildRedirectUrl = Utils.buildRedirectUrl(appConfig.getProtocolGestaoClinica(),
				appConfig.getUrlGestaoClinica(), appConfig.getServerIpGestaoClinica());
		return new ModelAndView(buildRedirectUrl);
	}

}
