package br.com.unipass.novamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipass.novamed.entity.UnipassForm;

@Controller
public class HelpUnipassController {

	@GetMapping(value = "/help")
	public ModelAndView showForm(@RequestParam(value = "ticket", required = false) String ticket, Model model) {
		System.out.println("ticket:" + ticket);
		return new ModelAndView("help", "unipassForm", new UnipassForm(ticket));
	}
}
