package eTicaretProjesi.bussiness.concretes;

import java.util.ArrayList;

import eTicaretProjesi.bussiness.abstracts.EmailCheckService;
import eTicaretProjesi.entities.concretes.Customer;

public class EmailCheckManager implements EmailCheckService{
	
	ArrayList<String> verificatedEmails = new ArrayList<String>();

	@Override
	public boolean checkVerifiedList(Customer customer) {
		if(verificatedEmails.contains(customer.geteMail())) {
			System.out.println(customer.geteMail() + " daha önce kullanýlmýþtýr.");
			return false;
		}else {
			System.out.println(customer.geteMail() + ": kayýt baþarýlý");
			return true;
		}
		
	}

	@Override
	public void sentEmail(Customer customer) {
		System.out.println(customer.geteMail() + " adresine doðrulama linki gönderildi");
		
	}

	@Override
	public void addToVerifiedList(Customer customer) {
		verificatedEmails.add(customer.geteMail());
		System.out.println(verificatedEmails);
		System.out.println("Kullanýcý Email aktivasyonu yapmýþtýr.");
		
	}

}
