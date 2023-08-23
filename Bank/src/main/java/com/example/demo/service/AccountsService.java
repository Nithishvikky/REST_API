package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Accounts;
import com.example.demo.repository.AccountsRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AccountsService {
    
	@Autowired
	AccountsRepo a;
	
	public Accounts saveInfo(Accounts e) {
		return a.save(e);
	}
	public List<Accounts> getInfo(){
		return a.findAll();
	}
	public Optional<Accounts> getInfoid(int id){
		return a.findById(id);
	}
	public Accounts updateinfo(Accounts e) {
		return a.saveAndFlush(e);
	}
	public void deleteInfo() {
		a.deleteAll();
	}
	public void deleteInfoid(int id) {
		a.deleteById(id); 
	}
	
	public Accounts updateAccountsById(	int id,Accounts E) {
        Optional<Accounts> optionalEmployee = a.findById(id);
        if(a.findById(id)!=null){
            Accounts existingEmployee = optionalEmployee.get();
            if(E.getUser_id()!=null)
            	existingEmployee.setUser_id(E.getUser_id());
            if(E.getA_type()!=null)
            	existingEmployee.setA_type(E.getA_type());
            if(E.getDate_created()!=null)
            	existingEmployee.setDate_created(E.getDate_created());
            if(E.getBalance() != null)
            	existingEmployee.setBalance(E.getBalance());
            return a.saveAndFlush(existingEmployee);
        } else {
            throw new EntityNotFoundException("Employee with ID " + id + " not found"); //updateById
        }
    }
	
}
