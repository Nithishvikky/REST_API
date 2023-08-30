package com.example.demo.model;


import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="User_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer user_id;
     private String username;
     private String password;
     private String first_name;
     private String last_name;
     private String email;
     private long phone_number;
     @Column(length=512)
     private String address;
     @Temporal(TemporalType.DATE)
     private Date dateOfBirth;
     
     @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name="user_id")
     private List<Accounts> account;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer user_id, String username, String password, String first_name, String last_name, String email,
			long phone_number, String address, Date dateOfBirth, List<Accounts> account) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.account = account;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Accounts> getAccount() {
		return account;
	}

	public void setAccount(List<Accounts> account) {
		this.account = account;
	}
     
}
