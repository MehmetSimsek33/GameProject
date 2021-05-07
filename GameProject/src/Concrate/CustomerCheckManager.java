package Concrate;

import Abstract.ICustomerCheckServices;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckServices {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
