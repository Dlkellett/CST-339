package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterModel 
{
	// Class variables 
	@NotNull(message="First Name is a required field.")
	@Size(min=6, max=24, message="First name must be between 6 and 24 characters.")
	private String firstName;
	
	@NotNull(message="Last Name is a required field.")
	@Size(min=6, max=24, message="Last name must be between 6 and 24 characters.")
	private String lastName;
	
	@NotNull(message="User name is a required field.")
	@Size(min=6, max=24, message="User name must be between 6 and 24 characters.")
	private String username;
	
	@NotNull(message="Password is a required field.")
	@Size(min=6, max=24, message="Password must be between 6 and 24 characters.")
	private String password;
	
	@NotNull(message="Age is a required field.")
	@Size(min=1, max=3, message="Age must be between 1 and 3 characters.")
	private int age;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/** 
	 * @return the lastName
	 */
	public String getLastName() 
	{
		return lastName;
	}
	
	/**
	 * @param lastName the lastName to set 
	 */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() 
	{
		return username;
	}
	
	/**
	 * @param username the username to set 
	 */
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() 
	{
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	/**
	 * @return the age 
	 */
	public int estAge() 
	{
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
}
