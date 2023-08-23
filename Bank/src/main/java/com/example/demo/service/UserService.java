package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo a;
	
	public User saveInfo(User e) {
		return a.save(e);
	}
	public List<User> getInfo(){
		return a.findAll();
	}
	public Optional<User> getInfoid(int id){
		return a.findById(id);
	}
	public User updateinfo(User e) {
		return a.saveAndFlush(e);
	}
	public void deleteInfo() {
		a.deleteAll();
	}
	public void deleteInfoid(int id) {
		a.deleteById(id);
	}
	
}
