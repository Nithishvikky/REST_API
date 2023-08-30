package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="transaction_table")
public class Transaction {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer transaction_id;
	private int account_id;
     private Date transaction_date;
     private String transaction_type;
     private long amount;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(Integer transaction_id, int account_id, Date transaction_date, String transaction_type,
			long amount) {
		super();
		this.transaction_id = transaction_id;
		this.account_id = account_id;
		this.transaction_date = transaction_date;
		this.transaction_type = transaction_type;
		this.amount = amount;
	}
	public Integer getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
     


     
}
