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


import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	UserService u;
	
	@PostMapping("/post1")
	public User Saveinfo(@RequestBody User a) {
		return u.saveInfo(a);
	}
	
	@GetMapping("/get1")
	public List<User> Getinfo(){
		return u.getInfo();
	}
	@GetMapping("/get1/{id}")
	public Optional<User> GetinfoId(@PathVariable int id){
		return u.getInfoid(id);
	}
	@PutMapping("put1")
	public User UpdateInfo(@RequestBody User a) {
		return u.updateinfo(a);
	}
	@DeleteMapping("/delete1")
	public String DeleteInfo() {
		u.deleteInfo();
		return "Deleted Successfully";
	}
	@DeleteMapping("/delete1/{id}")
	public String DeleteInfoId(@PathVariable int id) {
		u.deleteInfoid(id);
		return "Deleted Successfully";
	}
}
