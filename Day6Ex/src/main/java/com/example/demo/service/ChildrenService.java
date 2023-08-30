package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.ChildrenModel;
import com.example.demo.repository.ChildrenRepo;

@Service
public class ChildrenService {
	@Autowired
	ChildrenRepo cr;
	public ChildrenModel addinfo(ChildrenModel s) {
		return cr.save(s);
	}
	public List<ChildrenModel> show(){
		return cr.findAll();
	}
	public List<ChildrenModel> showinfo(String s){
		return cr.findAll(Sort.by(Sort.Direction.ASC,s));
	}
	public List<ChildrenModel> getbypage(int pageno,int pagesize){
		Page<ChildrenModel> p = cr.findAll(PageRequest.of(pageno,pagesize));
		return p.getContent();
	}
	public void deleteinfo(int id) {
		cr.deleteById(id);
	}
	public List<ChildrenModel> showdetails(String s,int page,int pageSize){
		PageRequest pageable = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.ASC, s));
        Page<ChildrenModel> childrenPage = cr.findAll(pageable);
        return childrenPage.getContent();
	}
	
}