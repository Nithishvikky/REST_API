package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService u;
	
	@PostMapping("/post2")
	public Transaction Saveinfo(@RequestBody Transaction a) {
		return u.saveInfo(a);
	}
	
	@GetMapping("/get3")
	public List<Transaction> Getinfo(){
		return u.getInfo();
	}
	@DeleteMapping("/delete3")
	public String DeleteInfo() {
		u.deleteInfo();
		return "Deleted Successfully";
	}
	@DeleteMapping("/delete3/{id}")
	public String DeleteInfoId(@PathVariable int id) {
		u.deleteInfoid(id);
		return "Deleted Successfully";
	}
}
