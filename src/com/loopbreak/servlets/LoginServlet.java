package com.loopbreak.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loopbreak.entities.Users;
import com.loopbreak.models.UsersHome;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	// public LoginServlet() {
	// super();
	// // TODO Auto-generated constructor stub
	// }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Get Method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		// initial users bean instance
		Users instance = new Users();
		instance.setEmail(email);
		instance.setPassword(pwd);
		// check if there is any user with given data
		UsersHome user = new UsersHome();
		List<Users> users = user.findByExample(instance);
		for (Users temp : users) {
			System.out.println(temp.getName());
		}
		if (users.size() > 0) {
			response.sendRedirect("home");
		} else {
			response.sendRedirect("index");
		}

	}

}
