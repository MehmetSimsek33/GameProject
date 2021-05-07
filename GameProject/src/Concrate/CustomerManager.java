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
					System.out.println("Musteri kayd� yap�ld� : "+customer.getFirstName());
				}
		else
		{
			System.out.println("Kay�t Ba�ar�s�z");
		}
			
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Musteri kayd� silindi : "+customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Musteri kayd� g�ncellendi : "+customer.getFirstName());
		
	}

}
