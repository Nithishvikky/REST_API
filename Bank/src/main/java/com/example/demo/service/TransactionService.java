package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Transaction;
import com.example.demo.repository.TransactionRepo;

@Service
public class TransactionService {

	@Autowired
	TransactionRepo u;
	
	public Transaction saveInfo(Transaction e) {
		return u.save(e);
	}
	public List<Transaction> getInfo(){
		return u.findAll();
	}

	public void deleteInfo() {
		u.deleteAll();
	}
	public void deleteInfoid(int id){
		u.deleteById(id);
	}
}
