package eTicaretProjesi.bussiness.concretes;

import java.util.ArrayList;

import eTicaretProjesi.bussiness.abstracts.EmailCheckService;
import eTicaretProjesi.entities.concretes.Customer;

public class EmailCheckManager implements EmailCheckService{
	
	ArrayList<String> verificatedEmails = new ArrayList<String>();

	@Override
	public boolean checkVerifiedList(Customer customer) {
		if(verificatedEmails.contains(customer.geteMail())) {
			System.out.println(customer.geteMail() + " daha �nce kullan�lm��t�r.");
			return false;
		}else {
			System.out.println(customer.geteMail() + ": kay�t ba�ar�l�");
			return true;
		}
		
	}

	@Override
	public void sentEmail(Customer customer) {
		System.out.println(customer.geteMail() + " adresine do�rulama linki g�nderildi");
		
	}

	@Override
	public void addToVerifiedList(Customer customer) {
		verificatedEmails.add(customer.geteMail());
		System.out.println(verificatedEmails);
		System.out.println("Kullan�c� Email aktivasyonu yapm��t�r.");
		
	}

}
