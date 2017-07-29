package com.loopbreak.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loopbreak.entities.Gurdians;
import com.loopbreak.entities.Students;
import com.loopbreak.models.GurdiansHome;
import com.loopbreak.models.StudentsHome;

@Controller
public class StudentController {

	@RequestMapping(value = "students_add", method = RequestMethod.GET)
	public String pageStudentAdd() {

		return "students_add";
	}

	@RequestMapping(value = "students_add", method = RequestMethod.POST)
	public String postStudent(Model model, HttpServletRequest request) {
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String studentId = request.getParameter("student_id");
		String accessCode = request.getParameter("access_code");
		// gurdian info
		String gurdianName = request.getParameter("gurdian_name");
		String gurdianAddress = request.getParameter("gurdian_address");
		String gurdianEmail = request.getParameter("gurdian_mail");
		String gurdianPhone = request.getParameter("gurdian_phone");
		// Integer pStatus = Integer.parseInt(request.getParameter("p_status"));
		Integer pStatus = 0;

		GurdiansHome gurdiansHome = new GurdiansHome();
		Gurdians gurdians = new Gurdians(gurdianName, gurdianAddress, gurdianPhone, 1, gurdianEmail);
		int id = gurdiansHome.persist(gurdians);
		Integer gurdian_id = id;
		StudentsHome studentsHome = new StudentsHome();
		Students student = new Students(fname, mname, lname, studentId, accessCode, gurdian_id, pStatus);
		studentsHome.persist(student);

		System.out.println("Saved with ID: " + id);
		model.addAttribute("msg", "Student inforamtion has been successfully Added!");
		return "students_add";
	}

}
