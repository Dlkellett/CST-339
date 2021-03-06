package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;
import com.gcu.model.RegisterModel;

@Controller
@RequestMapping("/login")
public class LoginController 
{
	@GetMapping("/")
	public String display(Model model)
	{
		// Display login form view 
		model.addAttribute("title", "Now it is time to Login!");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model)
	{
		// Variables
		String trueUsername = loginModel.getUsername();
		String truePassword = loginModel.getPassword();
		
		// Check for validation errors
		if (bindingResult.hasErrors())
		{
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		// Login handler that will manually check the username/password
		// This will be if the login was successful 
		if (trueUsername.toLowerCase().trim().equals("james") && truePassword.toLowerCase().trim().equals("dylan"))
		{
			model.addAttribute("title", "Login Success! Welcome in!");
			return "loginSuccess";
		}
		
		// This will be if the login had failed
		// Login handler that will manually check the username/password
		if (!trueUsername.toLowerCase().trim().equals("james") && !truePassword.toLowerCase().trim().equals("dylan"))
		{
			model.addAttribute("title", "Login Failed! Now leave!");
			return "loginFailed";
		}
		
		// Create some orders
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "0000000001", "Product 1", 1.00f, 1));
		orders.add(new OrderModel(1L, "0000000002", "Product 2", 2.00f, 2));
		orders.add(new OrderModel(2L, "0000000003", "Product 3", 3.00f, 3));
		orders.add(new OrderModel(3L, "0000000004", "Product 4", 4.00f, 4));
		orders.add(new OrderModel(4L, "0000000005", "Product 5", 5.00f, 5));
		
		// Display the Orders View
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		return "orders";
	}
	
	@GetMapping("/products")
	public String productsPage(Model model)
	{
		model.addAttribute("title", "This is where your products would be displayed");
		return "products";
	}
	
	@GetMapping("/reviews")
	public String reviewsPage(Model model)
	{
		model.addAttribute("title", "This is where your reviews would be displayed");
		return "reviews";
	}
	
	@GetMapping("/doRegister")
	public String registrationPage(Model model)
	{
		// Display the register page
		model.addAttribute("title", "Are you truly ready to register?");
		model.addAttribute("registerModel", new RegisterModel());
		return "register";
	}
	
	@PostMapping("/registerSuccess")
	public String successfulRegister(Model model)
	{	
		model.addAttribute("title", "You have successfully registered!");
		return "registerSuccess";
	}
}
