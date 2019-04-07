package com.tadigital.ecommerce.customer.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.tadigital.ecommerce.customer.entity.Customer;
import com.tadigital.ecommerce.customer.service.CustomerService;

@WebServlet("/personaldetails")
public class PersonalDetailsControllerServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("LoginForm.html");
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			
			e.printStackTrace();
		} 
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("fname");
		String lastname = req.getParameter("lname");
		String contact = req.getParameter("contact");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String zip=req.getParameter("zip");
		String  state=req.getParameter("state");
		String  country=req.getParameter("country");
		String nemail=req.getParameter("email");
		HttpSession sess=req.getSession();
		String email=(String)sess.getAttribute("EMAIL");
		
		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setNEmail(nemail);
		customer.setFirstName(firstname);
		customer.setLastName(lastname);
		customer.setContact(contact);
		customer.setGender(gender);
		customer.setAddress(address);
		customer.setCity(city);
		customer.setCountry(country);
		customer.setState(state);
		customer.setZip(zip);
		CustomerService customerService = new CustomerService();
		boolean status = customerService.personalDetails(customer);	

        if(status) {
        	RequestDispatcher rd = req.getRequestDispatcher("CustomerAccount.jsp");
        	try {
				rd.forward(req, resp);
			} catch (ServletException | IOException e) {
				
				e.printStackTrace();
			} 
        }
  }
}
