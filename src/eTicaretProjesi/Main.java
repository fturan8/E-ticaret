package eTicaretProjesi;

import eTicaretProjesi.bussiness.concretes.CustomerManager;
import eTicaretProjesi.bussiness.concretes.EmailCheckManager;
import eTicaretProjesi.bussiness.concretes.VerificationManager;
import eTicaretProjesi.dataAccess.concretes.HibernateCustomerDao;
import eTicaretProjesi.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Fýrat", "Turan","fturan8@gmail.com", "123456");
		Customer customer2 = new Customer("Emre", "Belözoðlu", "fturan8@gmail.com", "123456");
		Customer customer3 = new Customer("Alex", "DeSouza", "fturan8@gmail.com", "12345");
		Customer customer4 = new Customer("Semih", "Þentürk", "fturan8gmail.com", "123456");
		Customer customer5 = new Customer("Semih", "Þ", "fturan8gmail.com", "123456");
		Customer customer6 = new Customer("S", "Þentürk", "fturan8gmail.com", "123456");
		
		CustomerManager customerManager = new CustomerManager(new EmailCheckManager(),new VerificationManager(), new HibernateCustomerDao());
		
		customerManager.register(customer);
		customerManager.register(customer2);
		customerManager.register(customer3);
		customerManager.register(customer4);
		customerManager.register(customer5);
		customerManager.register(customer6);
	
				
	}

}
