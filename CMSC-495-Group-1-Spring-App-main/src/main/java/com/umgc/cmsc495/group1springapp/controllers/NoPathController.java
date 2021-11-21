package com.umgc.cmsc495.group1springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: Hiren Shah
 * Date: 11/19/2021
 */
@Controller
public class NoPathController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInitialPage(HttpServletRequest request, Model model){
		return "Initial-Page";
	}
}
