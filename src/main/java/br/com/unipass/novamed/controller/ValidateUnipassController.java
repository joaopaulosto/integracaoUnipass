package br.com.unipass.novamed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipass.novamed.entity.UnipassFrom;
import br.com.unipass.novamed.util.Utils;
import br.com.unipass.novamed.ws.domain.DomainWSImpl;
import br.com.unipass.novamed.ws.domain.ValidateUnipassResponse;
import br.com.unipass.novamed.ws.domain.WebServiceException;

@Controller
public class ValidateUnipassController {

//	Logger logger = (Logger) LoggerFactory.getLogger(ValidateUnipassController.class);

	@Autowired
	private DomainWSImpl unipassDomainWS;

	@GetMapping(value = "/index")
	public ModelAndView showForm(@RequestParam(value = "ticket", required = false) String ticket, Model model) {
		System.out.println("ticket:" + ticket);
		return new ModelAndView("index", "unipassForm", new UnipassFrom(ticket));
	}

	@GetMapping(value = "/")
	public ModelAndView showFormIndex() {
		return new ModelAndView("index", "unipassForm", new UnipassFrom(null));
	}

	@PostMapping(value = "/validateUnipass")
	public ModelAndView submit(@Valid @ModelAttribute("unipassForm") UnipassFrom unipassForm, BindingResult result,
			ModelMap model, HttpServletRequest request) {
		if (result.hasErrors()) {
			return new ModelAndView("index");
		}
		if (validateUnipass(unipassForm.getUnipass(), request)) {
			model.addAttribute("frase", unipassForm.getUnipass());
			return new ModelAndView("successUnipass");
		} else {
			UnipassFrom frm = new UnipassFrom(null);
			frm.setMensagem("Unipass Inválido");
			return new ModelAndView("index", "unipassForm", frm);
		}
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.POST)
	public String redirectUrl(@Valid @ModelAttribute("unipassForm") UnipassFrom unipassForm, BindingResult result,
			ModelMap model, HttpServletRequest request) {

		model.addAttribute("ticket", unipassForm.getTicket());

		String redirectUrl = "http://" + unipassForm.getUrl();
		if (unipassForm.getTicket() != null) {
			redirectUrl = redirectUrl + "?ticket=" + unipassForm.getTicket();
		}
		return "redirect:" + redirectUrl;
	}

	private boolean validateUnipass(String unipass, HttpServletRequest request) {
		ValidateUnipassResponse r;
		Integer codDominio = Integer.parseInt("1");
		try {
			r = unipassDomainWS.validateUnipass(Utils.getRemoteIpAddress(request), codDominio, unipass);
			if (r != null && r.getReturnCode() == 0) {
				return true;
			} else {
				return false;
			}
		} catch (WebServiceException e) {
			System.out.println(e.getMessage());
			throw new ValidationException("Unipass Inválido");
		}

	}

}
