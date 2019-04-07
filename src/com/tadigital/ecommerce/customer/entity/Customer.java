package com.tadigital.ecommerce.customer.entity;

import java.util.Calendar;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String oldpassword;
	private String newpassword;
	private String renewpassword;
	private String gender;
	private String contact;
	private String state;
	private String country;
	private String zip;
	private String address;
	private String city;
	private String nemail;
	
	public Customer(){
		
	}
	public Customer(int id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public String getNewPassword() {
		return newpassword;
	}
	public String getOldPassword() {
		return oldpassword;
	}
	public String getReNewPassword() {
		return renewpassword;
	}
	public String getPassword() {
		return password;
	}
	public String getGender() {
		return gender;
	}
	public String getCity() {
		return city;
	}
	
	public String getContact() {
		return contact;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getZip() {
		return zip;
	}
	public String getNEmail() {
		return nemail;
	}
	
	
	//SETTER OR MUTATOR METHODS
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setOldPassword(String password)
	{
		this.oldpassword = password;
	}
	public void setNewPassword(String password)
	{
		this.newpassword = password;
	}
	public void setReNewPassword(String password)
	{
		this.renewpassword = password;
	}
	public void setContact(String contact)
	{
		this.contact = contact;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + 
				lastName + ", email=" + email + 
				", password=" + password + "]";
	}
	public void setNEmail(String nemail) {

		this.nemail=nemail;
	}

}
