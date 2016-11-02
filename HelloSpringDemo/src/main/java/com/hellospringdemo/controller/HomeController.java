package com.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloSpringDemo
 * @author Winnie Nov 2, 2016
 * HomeController.java
 */

@Controller //tells the system that this java class is a controller
//Registers this Java class as a Spring bean from dispatcher-servlet.xml
public class HomeController {
	
	@RequestMapping("/") // '/' is the default root context path
	//whenever http request points to root context path of app folder
	//it maps to the following function aka a response
	public String home() { 
		return "home";
	}
}
