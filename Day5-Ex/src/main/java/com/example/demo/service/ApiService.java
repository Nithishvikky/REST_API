package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

import com.example.demo.repository.BookRepo;


import jakarta.persistence.EntityNotFoundException;

@Service
public class ApiService {

	@Autowired
	BookRepo r;
	
	public Book Add(Book s) {
		return r.save(s);
	}
	public Optional<Book> showId(int id) {
		return r.findById(id);
	}
	public List<Book> showAll() {
		return r.findAll();
	}
	public Book update(int id,Book s) {
		Optional<Book>temp=r.findById(id);
		if(temp.isPresent()) {
			Book e = temp.get();
			e.setBookName(s.getBookName());
			e.setId(s.getId());
			e.setAuthorName(s.getAuthorName());
			e.setPrice(s.getPrice());
			e.setQuantity(s.getQuantity());
			
			return r.saveAndFlush(e);
		}
		else {
			throw new EntityNotFoundException("Not found");
		}
		
	}
	public void delete(int id) {
		r.deleteById(id);
	}
	
}
