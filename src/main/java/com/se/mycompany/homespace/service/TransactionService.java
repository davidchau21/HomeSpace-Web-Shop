package com.se.mycompany.homespace.service;

import java.util.List;

import com.se.mycompany.homespace.model.Transactions;


public interface TransactionService {
	void insert(Transactions transaction);
	 
	void edit(Transactions transaction); 

	void delete(String id); 
 
	Transactions get(int id); 
	 
	Transactions get(String name); 
 
	List<Transactions> getAll(); 

}
