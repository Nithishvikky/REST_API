package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ChildrenModel;
import com.example.demo.service.ChildrenService;

@RestController
public class ChildernController {
	@Autowired
	ChildrenService cser;
	@PostMapping("add")
	public ChildrenModel adddeatils(@RequestBody ChildrenModel s) {
		return cser.addinfo(s);
	}
	@GetMapping("show")
	public List<ChildrenModel> showinfo(){
		return cser.show();
	}
	@GetMapping("/{name}")
	public List<ChildrenModel> showdetails(@PathVariable String name){
		return cser.showinfo(name);
	}
	@GetMapping("{pageno}/{pagesize}")
	public List<ChildrenModel> showinfo(@PathVariable int pageno,@PathVariable int pagesize){
		return cser.getbypage(pageno, pagesize);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		cser.deleteinfo(id);
	}
	@GetMapping("/{name}/{pageno}/{pagesize}")
	public List<ChildrenModel> showdetails(@PathVariable String name,@PathVariable int pageno,@PathVariable int pagesize){
		return cser.showdetails(name, pageno, pagesize);
	}
}