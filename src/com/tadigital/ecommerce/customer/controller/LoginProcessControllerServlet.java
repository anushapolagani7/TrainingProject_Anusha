package com.tadigital.ecommerce.customer.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tadigital.ecommerce.customer.entity.*;
import com.tadigital.ecommerce.customer.service.*;

@WebServlet("/login")
public class LoginProcessControllerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("LoginForm.html");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("name");
		String password = req.getParameter("pwd");
		
		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setPassword(password);
		
		CustomerService customerService = new CustomerService();
		boolean status = customerService.loginCustomer(customer);	
		if(status) {
			HttpSession ses = req.getSession();
			ses.setAttribute("CUSTOMERDATA", customer);
			
			RequestDispatcher rd = req.getRequestDispatcher("CustomerAccount.html");
			rd.forward(req, resp);
		} else {
			req.setAttribute("STATUS1", "false");
			RequestDispatcher rd = req.getRequestDispatcher("SignInSignUpForms.jsp");
			rd.forward(req, resp);
			
		}
	}
}