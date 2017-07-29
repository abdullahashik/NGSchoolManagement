package com.loopbreak.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loopbreak.entities.Staff;
import com.loopbreak.models.StaffHome;

@Controller
public class TeacherController {

	@RequestMapping(value = "teachers", method = RequestMethod.GET)
	public String pageTeacher(Model model) {

		StaffHome staffHome = new StaffHome();
		List<Staff> teachers = staffHome.getAllStaff();
		model.addAttribute("teachers", teachers);
		return "teachers";
	}

	@RequestMapping(value = "teachers", method = RequestMethod.POST)
	public String postTeacher(Model model, HttpServletRequest request) {
		StaffHome staffHome = new StaffHome();
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String description = request.getParameter("description");
		Staff staff = new Staff(name, address, phone, email, description, 1);
		staffHome.persist(staff);
		model.addAttribute("msg", "Successfully Data inserted!");
		return "teachers";
	}
}
