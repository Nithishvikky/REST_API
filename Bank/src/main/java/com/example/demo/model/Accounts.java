package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Account_table")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer account_id;
    
	private Integer user_id;
	private String a_type;
	private Integer balance;
	
	@Temporal(TemporalType.DATE)
	private Date date_created;

	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accounts(Integer account_id, Integer user_id, String a_type, Integer balance, Date date_created) {
		super();
		this.account_id = account_id;
		this.user_id = user_id;
		this.a_type = a_type;
		this.balance = balance;
		this.date_created = date_created;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getA_type() {
		return a_type;
	}

	public void setA_type(String a_type) {
		this.a_type = a_type;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	
	
}
