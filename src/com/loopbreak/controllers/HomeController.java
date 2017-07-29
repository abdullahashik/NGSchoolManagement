package com.loopbreak.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loopbreak.entities.Students;
import com.loopbreak.entities.Users;
import com.loopbreak.models.StudentsHome;
import com.loopbreak.models.UsersHome;

/**
 * Handles requests for the application home page.
 * 
 */
@Controller
public class HomeController {

	// private static final Logger logger =
	// LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "login";
	}

	/**
	 * Get user login
	 */

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String makeLogin(HttpServletRequest request) {
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		Users users = new Users();
		users.setEmail(email);
		users.setPassword(pwd);

		UsersHome usersHome = new UsersHome();
		usersHome.findByExample(users);
		return "dashboard";
	}

	// dashboard
	@RequestMapping(value = "dashboard")
	public String pageDashboard() {
		return "dashboard";
	}

	/**
	 * Route for registration page
	 */
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String pageRegister() {
		return "registration";
	}

	/**
	 * make user registration
	 */
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String makeResister(Model model) {
		return "login";
	}

	/**
	 * Route for User dashboard
	 */
	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public String userLogin(String email, String pwd) {
		return "dashboard";
	}

	/**
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "students", method = RequestMethod.GET)
	public String pageStudents(Integer take, Integer skip, Integer page, Model model) {
		System.out.println("sent to limit by " + take + " and " + skip);
		// public String pageStudents(Model model) {
		StudentsHome studentsHome = new StudentsHome();
		// List<Students> students = studentsHome.getAllStudentsLimited(take,
		// skip);
		List<Students> students = studentsHome.getAllStudents();
		model.addAttribute("students", students);
		return "students";
	}

	@RequestMapping(value = "students/{id}", method = RequestMethod.GET)
	public String pageStudent(Model model, Integer id) {

		StudentsHome studentsHome = new StudentsHome();
		Students students = studentsHome.findById(id);
		model.addAttribute("student", students);
		return "students";
	}

	/**
	 * Route for books
	 */
	@RequestMapping(value = "books")
	public String pageBook() {

		return "books";
	}

	/**
	 * Route for classes
	 */
	@RequestMapping(value = "classes")
	public String pageClasses() {
		return "classes";

	}

	/**
	 * Route for exams
	 * 
	 * @return
	 */
	@RequestMapping(value = "exams")
	public String pageExams() {
		return "exams";
	}

	/**
	 * Route for exam category
	 */
	public String pageExamCategory() {
		return "exam_category";
	}

	/**
	 * Route for exam result
	 */
	public String pageExamResult() {
		return "exam_result";
	}

	/**
	 * Route for exam routine
	 */
	public String pageExamRoutine() {
		return "exam_routin";
	}

}
