package com.tadigital.ecommerce.customer.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tadigital.ecommerce.customer.entity.Customer;
import com.tadigital.ecommerce.customer.service.CustomerService;

@WebServlet("/changepassword")
public class ChangePasswordControllerServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("LoginForm.html");
		rd.forward(req, resp);
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String oldpassword = req.getParameter("oldpwd");
		String newpassword = req.getParameter("newpwd");
		String retypedpassword = req.getParameter("renew");
		HttpSession session=req.getSession();
		String email=(String)session.getAttribute("EMAIL");
		
		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setOldPassword(oldpassword);
		customer.setNewPassword(newpassword);
		customer.setReNewPassword(retypedpassword);
		
		
		CustomerService customerService = new CustomerService();
		boolean status = customerService.loginCustomer(customer);
}
}
