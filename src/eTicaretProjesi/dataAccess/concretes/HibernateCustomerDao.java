package eTicaretProjesi.dataAccess.concretes;

import eTicaretProjesi.dataAccess.abstracts.CustomerDao;
import eTicaretProjesi.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Database'e loglandý: " +  customer.getName() + " " + customer.getLastName() );
		
	}

}
