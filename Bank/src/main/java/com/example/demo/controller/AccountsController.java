package com.example.demo.controller;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Accounts;
import com.example.demo.service.AccountsService;

@RestController
public class AccountsController {
     
	@Autowired
	AccountsService u;
	
	@PostMapping("/post")
	public Accounts Saveinfo(@RequestBody Accounts a) {
		return u.saveInfo(a);
	}
	
	@GetMapping("/get")
	public List<Accounts> Getinfo(){
		return u.getInfo();
	}
	@GetMapping("/get/{id}")
	public Optional<Accounts> GetinfoId(@PathVariable int id){
		return u.getInfoid(id);
	}
	@PutMapping("put")
	public Accounts UpdateInfo(@RequestBody Accounts a) {
		return u.updateinfo(a);
	}
	@DeleteMapping("/delete")
	public String DeleteInfo() {
		u.deleteInfo();
		return "Deleted Successfully";
	}
	@DeleteMapping("/delete/{id}")
	public String DeleteInfoId(@PathVariable int id) {
		u.deleteInfoid(id);
		return "Deleted Successfully";
	}
}
