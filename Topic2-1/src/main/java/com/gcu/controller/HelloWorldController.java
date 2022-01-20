package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")

public class HelloWorldController
{
	/**
	 * Simple Hello World Controller that will return a string in the response body.
	 * Invoke using /test1 URI 
	 * 
	 * @return Hello World test string
	 */
	// localhost:8080/hello/test1 - HTTP GET
	@GetMapping("/test1")
	// Return Raw Content
	@ResponseBody
	public String printHello()
	{
		// Simply return a string in the response body 
		// Must use @ResponseBody annotation
		return "Hello World! Oh god this class is getting to become really scary...";
	}
}
