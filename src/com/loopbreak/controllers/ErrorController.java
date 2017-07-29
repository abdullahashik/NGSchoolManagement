package com.loopbreak.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class ErrorController {

	//@RequestMapping(value = "errors", method = RequestMethod.GET)
	public ModelAndView renderErrorPages(HttpServletRequest httpRequest) {
		ModelAndView errorPage = new ModelAndView("errorPage");
		String errorMsg = "";
		int httpErrorCode = getErrorCode(httpRequest);
		switch (httpErrorCode) {
		case 400:
			break;
		case 401:
			break;
		case 402:
			break;
		case 403:
			break;
		case 404:
			errorMsg = "Page not found!";
			break;
		}
		errorPage.addObject("errorMsg", errorMsg);
		return errorPage;
	}

	private int getErrorCode(HttpServletRequest httpRequest) {
		return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
	}
}