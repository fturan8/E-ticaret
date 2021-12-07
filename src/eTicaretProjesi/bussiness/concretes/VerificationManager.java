package eTicaretProjesi.bussiness.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretProjesi.bussiness.abstracts.VerificationService;
import eTicaretProjesi.entities.concretes.Customer;

public class VerificationManager implements VerificationService{

	@Override
	public boolean checkEmail(Customer customer) {
		Pattern regexEmail = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
		Matcher matcher = regexEmail.matcher(customer.geteMail());
		
		if(matcher.matches()){
			System.out.println("Email formatýnda giriþ yapýldý: UYGUN");
			
			return true;
		}else {
			System.out.println("Email uygun deðildir!");
			return false;
		}
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if(customer.getPassword().length() >=6) {
			System.out.println("Þifre: UYGUN");
			return true;
		}else {
			System.out.println("Þifre en az 6 karakterden oluþmalý");
		return false;
	}
	}

	@Override
	public boolean checkFirstName(Customer customer) {
		if(customer.getName().length() >=2 && !customer.getName().isEmpty()) {
			System.out.println("Ad: UYGUN");
			return true;
		}else {
			System.out.println("Ad: eksik karakter girildi");
			return false;
		}
	}

	@Override
	public boolean checkLastName(Customer customer) {
		if(customer.getLastName().length() >=2 && !customer.getLastName().isEmpty()) {
			System.out.println("Soyad: UYGUN");
			return true;
		}else {
			System.out.println("Soyad: eksik karakter girildi");
			return false;
		}
	}

	
	
}
