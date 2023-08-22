package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
@Service
public class ApiService {
   
	@Autowired
	EmployeeRepo e;
	
	public Employee saveInfo(Employee ee) {
		return e.save(ee);
	}
	public Optional<Employee> showInfo(int id) {
		return e.findById(id);
	}
	public List<Employee> showEvery() {
		return e.findAll();
	}
}
