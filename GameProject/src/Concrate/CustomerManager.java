package Concrate;

import Abstract.ICustomerCheckServices;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService {
	
	ICustomerCheckServices customerservices;
	public CustomerManager(ICustomerCheckServices customerservices)
	{
	
		this.customerservices = customerservices;
	}

	@Override
	public void register(Customer customer) {
		if(customerservices.checkIfRealPerson(customer))
				{
					System.out.println("Musteri kaydý yapýldý : "+customer.getFirstName());
				}
		else
		{
			System.out.println("Kayýt Baþarýsýz");
		}
			
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Musteri kaydý silindi : "+customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Musteri kaydý güncellendi : "+customer.getFirstName());
		
	}

}
