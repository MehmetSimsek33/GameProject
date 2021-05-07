package Abstract;

import Entities.Customer;

public interface ICustomerService 
{
	 void register(Customer customer);
	 void delete(Customer customer);
	 void update(Customer customer);
}
