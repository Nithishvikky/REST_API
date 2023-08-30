package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer>{}
