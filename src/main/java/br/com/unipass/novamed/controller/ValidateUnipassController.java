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

import br.com.unipass.novamed.entity.UnipassForm;
import br.com.unipass.novamed.util.Utils;
import br.com.unipass.novamed.validator.UnipassValidator;

@Controller
public class ValidateUnipassController {

	@Autowired
	private UnipassValidator unipassValidator;
	
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		//binder.setValidator(unipassValidator);
	}

	@GetMapping(value = "/index")
	public ModelAndView showForm(@RequestParam(value = "ticket", required = false) String ticket, Model model) {
		System.out.println("ticket:" + ticket);
		return new ModelAndView("index", "unipassForm", new UnipassForm(ticket));
	}

	@GetMapping(value = "/")
	public ModelAndView showFormIndex() {
		return new ModelAndView("index", "unipassForm", new UnipassForm(null));
	}

	@PostMapping(value = "/validateUnipass")
	public ModelAndView submit(@Valid @ModelAttribute("unipassForm") UnipassForm unipassForm, BindingResult result,
			ModelMap model, HttpServletRequest request) {

		// Seta o ip de cliente
		unipassForm.setIp(Utils.getRemoteIpAddress(request));

		unipassValidator.validate(unipassForm, result);

		if (result.hasErrors()) {
			unipassForm.setUnipass(StringUtils.EMPTY);
			return new ModelAndView("index", "unipassForm", unipassForm);
		} else {
			return new ModelAndView("successUnipass", "unipassForm", unipassForm);
		}
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.POST)
	public String redirectUrl(@Valid @ModelAttribute("unipassForm") UnipassForm unipassForm, BindingResult result,
			ModelMap model, HttpServletRequest request) {

		model.addAttribute("ticket", unipassForm.getTicket());

		String redirectUrl = "http://" + unipassForm.getUrl();
		if (unipassForm.getTicket() != null) {
			redirectUrl = redirectUrl + "?ticket=" + unipassForm.getTicket();
		}
		return "redirect:" + redirectUrl;
	}

}
