package eTicaretProjesi.bussiness.abstracts;

import eTicaretProjesi.entities.concretes.Customer;

public interface CustomerService {
	
	void register(Customer customer);
	void login(Customer customer);

}
