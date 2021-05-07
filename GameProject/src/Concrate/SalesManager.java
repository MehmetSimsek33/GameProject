package Concrate;

import Abstract.ISalesService;
import Entities.Campain;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements ISalesService
{

	@Override
	public void sales(Customer customer, Game game, Campain campain) {
		
		System.out.println("Sayýn "+customer.getFirstName()
		+" " +customer.getLastNmae()+" "+game.getGameName()+"oyunu %"+String.valueOf(campain.getCampainRate())
		+" Kampanya ile baþarýlý bir þekilde satýþ iþleminiz gerceklestirilmitir");
		
	}

}
