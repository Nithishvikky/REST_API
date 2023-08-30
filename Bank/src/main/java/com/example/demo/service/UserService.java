package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
        
	@Autowired
	UserRepo u;
	
	public User saveInfo(User e) {
		return u.save(e);
	}
	public List<User> getInfo(){
		return u.findAll();
	}

	public void deleteInfo() {
		u.deleteAll();
	}
	
	public Optional<User> getInfoid(int id){
		return u.findById(id);
	}
	public User updateinfo(User e) {
		return u.saveAndFlush(e);
	}
	public void deleteInfoid(int id) {
		u.deleteById(id); 
	}
	//Ascending
	public List<User>sortuserinfo (String s){
		return u.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	//Descending
	public List<User>sortuserinfo1 (String s){
		return u.findAll(Sort.by(Sort.Direction.DESC,s));
	}
	//Paging
	public List<User> getbypage(int pgno,int pgsize){
		Page<User> p=u.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();		
	}
}
