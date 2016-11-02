package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBootDemo
 * @author Winnie Oct 20, 2016
 * HomeController.java
 */
@RestController
public class HomeController {
	@RequestMapping("/") //tells spring framework to get the rootpath url of this application. 
	//accept this path and it will return hello world string through rest controller.
	public String home(){
		return "Hello, World!";
	}
}
