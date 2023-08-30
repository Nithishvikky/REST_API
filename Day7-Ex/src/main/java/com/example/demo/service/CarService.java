package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepo;
@Service
public class CarService {
	@Autowired
	CarRepo crep;
	
	public Car save(Car data) {
		return crep.save(data);
	}
	
	public List<Car> getByOwn(int own){
		return crep.getCarInFromOwners(own);
	}
	public List<Car> getByAddr(String addr){
		return crep.getCarInFromAddress(addr);
	}
	public List<Car> getByName(String name){
		return crep.getCarFromName(name);
	}
	public List<Car> getBoth(int own, String type){
		return crep.getCarInFromOwnNCt(own, type);
	}
}
