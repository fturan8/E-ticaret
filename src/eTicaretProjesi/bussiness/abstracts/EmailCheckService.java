package eTicaretProjesi.bussiness.abstracts;

import eTicaretProjesi.entities.concretes.Customer;

public interface EmailCheckService {
	boolean checkVerifiedList(Customer customer);
	void sentEmail(Customer customer);
	void addToVerifiedList(Customer customer);
	
	

}
