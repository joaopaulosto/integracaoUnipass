package br.com.unipass.novamed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipass.novamed.config.ApplicationConfig;
import br.com.unipass.novamed.entity.UnipassForm;
import br.com.unipass.novamed.service.UnipassService;
import br.com.unipass.novamed.util.Utils;
import br.com.unipass.novamed.validator.RegisterUnipassValidator;

@Controller
public class HelpUnipassController {

	private static final String HELP_VIEW = "help";

	@Autowired
	private RegisterUnipassValidator unipassValidator;

	@Autowired
	private ApplicationConfig appConfig;

	@Autowired
	private UnipassService unipassService;

	@GetMapping(value = "/" + HELP_VIEW)
	public ModelAndView showForm(@RequestParam(value = "ticket", required = false) String ticket, Model model,
			HttpServletRequest request) {
		Utils.persisterTicket(ticket, request);
		return new ModelAndView(HELP_VIEW, "unipassForm", new UnipassForm());
	}

	@GetMapping(value = "/recoveryTicket")
	public String recoverySessionByErrorPage(HttpServletRequest request) {
		return "index?ticket=" + Utils.getTicket(request);
	}

	@PostMapping(value = "/registerUnipass")
	public String regiserUserInDomain(@RequestParam(value = "ticket", required = false) String ticket,
			@Valid @ModelAttribute("unipassForm") UnipassForm unipassForm, BindingResult result, ModelMap model,
			HttpServletRequest request) {

		unipassValidator.validate(unipassForm, result);

		if (result.hasErrors()) {
			unipassForm.setUnipass(StringUtils.EMPTY);
			model.addAttribute("unipassForm", unipassForm);
			return HELP_VIEW;
		} else {
			try {
				String remoteIpAddress = Utils.getRemoteIpAddress(request);
				unipassService.registerUserInDomain(unipassForm.getUnipass(), unipassForm.getUserName(),
						remoteIpAddress);
				// String finalTicket = StringUtils.isEmpty(ticket) ? Utils.getTicket(request) :
				// ticket;

				return Utils.buildRedirectUrl(appConfig.getProtocolGestaoClinica(), appConfig.getUrlGestaoClinica(),
						appConfig.getServerIpGestaoClinica());
			} catch (Exception e) {
				result.rejectValue("unipass", "unipass.error", e.getMessage());
				model.addAttribute("unipassForm", unipassForm);
				return HELP_VIEW;
			}
		}

	}
}
