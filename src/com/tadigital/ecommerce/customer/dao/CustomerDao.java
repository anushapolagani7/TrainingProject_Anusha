package com.tadigital.ecommerce.customer.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import com.tadigital.ecommerce.customer.entity.Customer;

public class CustomerDao extends Dao {
	public boolean selectCustomerByEmailAndPassword(Customer customer) {
		boolean status = false;
	
		Connection con = openConnection();
		Statement stmt = openStatement(con);
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM customer_info WHERE customer_email = '" + customer.getEmail() + "' AND customer_pwd = '" + customer.getPassword() + "'";
			
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				status = true;
				
				customer.setId(rs.getInt(1));
				customer.setFirstName(rs.getString(2));
				customer.setLastName(rs.getString(3));
				
			   }
		    } catch (SQLException sqle) {
			      sqle.printStackTrace();
		    } finally {
			     closeStatement(stmt);
			     closeResultSet(rs);
			     closeConnection(con);
		        }
		
		  return status;
	   }
	
	public boolean insertCustomer(Customer customer) {
		boolean status = false;
		
		Connection con = openConnection();
		Statement stmt = openStatement(con);
		
		try {
			String sql = "INSERT INTO customer_info(customer_fname, customer_lname,customer_email, customer_pwd) " +
						 "VALUES('" + customer.getFirstName() + "', '" + customer.getLastName() +
						 "', '" + customer.getEmail() + "', '" + customer.getPassword() + "')";
			
			int rows = stmt.executeUpdate(sql);
			if(rows != 0) {
				status = true;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			closeStatement(stmt);
			closeConnection(con);
		}
		
		return status;
	}
	public boolean changeCustomerPassword(Customer customer) {
boolean status = false;
		
		Connection con = openConnection();
		Statement stmt = openStatement(con);
		
		try {
			String sql1="SELECT * FROM customer_info WHERE customer_email='"+customer.getEmail()+"' AND customer_pwd='"+customer.getOldPassword()+"'";
			ResultSet rs=stmt.executeQuery(sql1);
			while(rs.next())
			{
			
				if(customer.getReNewPassword().equals(customer.getNewPassword())) {
					
				
				String sql2 = "UPDATE  customer_info SET customer_pwd='"+customer.getNewPassword()+"' WHERE customer_email='"+customer.getEmail()+"'";
				
					int rows = stmt.executeUpdate(sql2);
					if(rows != 0) {
						status = true;
					}
				}
				
			}	
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			closeStatement(stmt);
			closeConnection(con);
		}
		
		return status;
		
		
	}
	public boolean changeCustomerPersonalDetails(Customer customer) {
		boolean status = false;
				
				Connection con = openConnection();
				Statement stmt = openStatement(con);
				
				try {
					String sql1="UPDATE customer_info SET customer_fname='"+customer.getFirstName()+"',customer_lname='"+customer.getLastName()+"',customer_gender='"+customer.getGender()+"',customer_country='"+customer.getCountry()+"',customer_state='"+customer.getState()+"',customer_address='"+customer.getAddress()+"',customer_contact='"+customer.getContact()+"',customer_email='"+customer.getNEmail()+"' WHERE customer_email='"+customer.getEmail()+"'";
					
						
							int rows = stmt.executeUpdate(sql1);
							if(rows != 0) {
								status = true;
							}
						
						
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				} finally {
					closeStatement(stmt);
					closeConnection(con);
				}
				
				return status;
				
				
			}
			
	


}
