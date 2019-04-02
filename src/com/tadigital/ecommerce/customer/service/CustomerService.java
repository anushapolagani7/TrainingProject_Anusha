package com.tadigital.ecommerce.customer.service;

import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeBodyPart;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeMultipart;
import com.tadigital.ecommerce.customer.dao.CustomerDao;
import com.tadigital.ecommerce.customer.entity.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();
	/*public boolean loginEmployee(Customer customer) {
		boolean status = CustomerDao.selectEmployeeByEmailAndPassword(customer);
		
		return status;
	}*/
	
	public boolean registerCustomer(Customer customer) {
		boolean status = customerDao.insertCustomer(customer);
		if(status) {
			sendWelcomeMail(customer.getFirstName() + " " + customer.getLastName(), customer.getEmail());
		}
		
		return status;
	}
	
	/*public ArrayList<Customer> getAllEmployees() {
		ArrayList<Customer> employeeList = customerDao.selectAllEmployees();
		
		return employeeList;
	}*/
	public boolean loginCustomer(Customer customer) {
		boolean status=customerDao.selectCustomerByEmailAndPassword(customer);
		return status;
		
	}
	public String sendWelcomeMail(String name, String email) {
		String status = "NOT SENT";
		
		
		//MAIL SERVER CONFIGURATION
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class",	"javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");
		
		//CONNECT TO MAIL SERVER
		Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
																	protected PasswordAuthentication getPasswordAuthentication() {
																		return new PasswordAuthentication("anushapolagani7@gmail.com","9493259772");
																	}
																});
		try {
			//COMPOSE MESSAGE
			MimeMessage mimeMessage = new MimeMessage(session);
			mimeMessage.setFrom(new InternetAddress("anushapolagani7@gmail.com"));
			mimeMessage.setRecipients(Message.RecipientType.TO,	InternetAddress.parse(email));
			
			mimeMessage.setSubject("Welcome to TA Digital Online Shopping Portal.");
			/*String msg = "Hello " + name + ",\n\n" +
						 "Thanks for Registering on our shopping portal." +
						 "\nWelcome to TA Digital" +
						 "\n\nThanks & Regards" +
						 "\nAnusha Polagani";
			mimeMessage.setText(msg);

			//SEND MAIL*/
			
			
			Transport.send(mimeMessage);
			
			status = "SENT";
		} catch (MessagingException mex) {
			mex.printStackTrace();
		} 
		
		return status;
	}


}
