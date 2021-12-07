package eTicaretProjesi.bussiness.abstracts;

import eTicaretProjesi.entities.concretes.Customer;

public interface VerificationService {
	boolean checkFirstName(Customer customer);
	boolean checkLastName(Customer customer);
	boolean checkEmail(Customer customer);
	boolean checkPassword(Customer customer);
	
}
