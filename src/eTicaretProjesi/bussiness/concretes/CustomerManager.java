package eTicaretProjesi.bussiness.concretes;

import eTicaretProjesi.bussiness.abstracts.CustomerService;
import eTicaretProjesi.bussiness.abstracts.EmailCheckService;
import eTicaretProjesi.bussiness.abstracts.VerificationService;
import eTicaretProjesi.dataAccess.abstracts.CustomerDao;
import eTicaretProjesi.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	private EmailCheckService emailControl;
	private VerificationService verify;
	private CustomerDao customerDao;
	
	public CustomerManager(EmailCheckService emailControl , VerificationService verify, CustomerDao customerDao) {
		this.emailControl = emailControl;
		this.verify = verify;
		this.customerDao = customerDao;
	}
	
	//EmailCheckService emailControl = new EmailCheckManager(); 
	//VerificationService verify = new VerificationManager(new EmailCheckManager());
;
	@Override
	public void register(Customer customer) {
		
		if(verify.checkFirstName(customer) && verify.checkLastName(customer) && verify.checkEmail(customer) && verify.checkPassword(customer) && emailControl.checkVerifiedList(customer)){
			
			emailControl.sentEmail(customer);
			emailControl.addToVerifiedList(customer);
			customerDao.add(customer);
				
			System.out.println("Kullanýcý kaydý baþarýlý.++++++++++++++++++++++++++");
			
		}else {
			System.out.println("Kullanýcý kaydý baþarýsýz.-------------------------");
		}
		
		
	}

	@Override
	public void login(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
