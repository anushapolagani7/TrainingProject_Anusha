package com.tadigital.ecommerce.customer.controller;


	import java.io.IOException;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpSession;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.tadigital.ecommerce.customer.entity.*;
	import com.tadigital.ecommerce.customer.service.*;

	@WebServlet("/register")
	public class RegistrationProcessControllerServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			RequestDispatcher rd = req.getRequestDispatcher("RegistrationForm.html");
			rd.forward(req, resp);
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String[] data=req.getParameter("name").split(" ");
			String firstName =data[0];
			String lastName = data[1];
			String email = req.getParameter("email");
			String password = req.getParameter("pwd");
            if(email.equals(" ")||password.equals(" ")) {
				
				RequestDispatcher rd = req.getRequestDispatcher("SignInSignUpForms.jsp");
				rd.forward(req, resp);
				
			}
            else {
			Customer customer = new Customer();
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setEmail(email);
			customer.setPassword(password);
			
			CustomerService customerService = new CustomerService();
			boolean status = customerService.registerCustomer(customer);
			  if(status) {
				  req.setAttribute("STATUS", "S");
				   
				 RequestDispatcher rd = req.getRequestDispatcher("SignInSignUpForms.jsp");
				 rd.forward(req, resp);
			    } 
			  else {
				
				  	req.setAttribute("STATUS", "F");
				  
					 RequestDispatcher rd = req.getRequestDispatcher("SignInSignUpForms.jsp");
					 rd.forward(req, resp);
				
			}
		}
	  }
	}


