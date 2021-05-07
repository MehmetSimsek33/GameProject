package Abstract;

import Entities.Campain;
import Entities.Customer;
import Entities.Game;

public interface ISalesService
{
	void sales(Customer customer,Game game,Campain campain);
}
