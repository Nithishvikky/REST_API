package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
    ApiService a;
	
	@PostMapping("/post")
	public Employee savedetails(@RequestBody Employee e) {
		return a.saveInfo(e);
	}
	@GetMapping("/disp")
	public List<Employee> showAll() {
		return a.showEvery();
	}
	@GetMapping("/disp/{id}")
	public Optional<Employee> showOne(@PathVariable int id) {
		return a.showInfo(id);
	}
	
}
