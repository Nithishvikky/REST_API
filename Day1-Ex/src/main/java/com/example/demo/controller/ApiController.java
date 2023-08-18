package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{
	
	public String studentName="IamNeo";
	public String color="Green";
	
	@GetMapping("disp1")
     public String Welcome(){
    	 return "Welcome String Boot!";
     }
	
	@GetMapping("disp2")
    public String getName(){
   	 return "Welcome "+studentName+"!";
    }
	
	@GetMapping("disp3")
    public String getMyFav(){
   	 return "My favorite color is "+color;
    }
}
