package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Book;

import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
    ApiService a;
	
	@PostMapping("/post")
	public Book add(@RequestBody Book s) {
		return a.Add(s);
	}
	@PutMapping("/put/{id}")
	public Book Update(@PathVariable int id,@RequestBody Book s) {
		return a.update(id,s);
	}
	
	@GetMapping("/disp/{id}")
	public Optional<Book> show(@PathVariable int id){
		return a.showId(id);
	}
	
	@GetMapping("/disp")
	public List<Book> show(){
		return a.showAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String fck(@PathVariable int id) {
		a.delete(id);
		return "Deleted Sucessfully";
	}
}
