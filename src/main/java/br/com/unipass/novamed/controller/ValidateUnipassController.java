package br.com.unipass.novamed.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipass.novamed.entity.UnipassFrom;

@Controller
public class ValidateUnipassController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showForm(@RequestParam(value = "id", required = false) String id) {
		System.out.println("Id:" + id );
		return new ModelAndView("index", "unipassForm", new UnipassFrom(id));
	}

	@RequestMapping(value = "/validateUnipass", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("unipassForm") UnipassFrom unipassForm, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("frase", unipassForm.getUnipass());
		return "successUnipass";

	}

	@RequestMapping(value = "/redirect", method = RequestMethod.POST)
	public String redirectUrl(@Valid @ModelAttribute("unipassForm") UnipassFrom unipassForm, BindingResult result,
			ModelMap model) {
		
		model.addAttribute("id", unipassForm.getId());
		String redirectUrl = "http://" + unipassForm.getUrl();
		return "redirect:" + redirectUrl;

	}

}
