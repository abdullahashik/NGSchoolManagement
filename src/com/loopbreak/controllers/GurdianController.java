package com.loopbreak.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loopbreak.entities.Gurdians;
import com.loopbreak.models.GurdiansHome;

@Controller
public class GurdianController {

	// show all gurdians
	@RequestMapping(value = "gurdians", method = RequestMethod.GET)
	public String pageGurdians(Model model) {
		GurdiansHome gurdiansHome = new GurdiansHome();
		List<Gurdians> gurdians = gurdiansHome.getAllGurdians();
		model.addAttribute("gurdians", gurdians);
		return "gurdians";
	}

	// post new gurdian
	@RequestMapping(value = "gurdians", method = RequestMethod.POST)
	public String addNewGurdian(HttpServletRequest request, Model model) {
		GurdiansHome gurdiansHome = new GurdiansHome();
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		Gurdians gurdians = new Gurdians(name, address, phone, 1, email);
		gurdiansHome.persist(gurdians);
		model.addAttribute("msg", "Successfully New Data Added");
		
		return "gurdians";
	}
}
