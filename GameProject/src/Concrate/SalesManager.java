package Concrate;

import Abstract.ISalesService;
import Entities.Campain;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements ISalesService
{

	@Override
	public void sales(Customer customer, Game game, Campain campain) {
		
		System.out.println("Say�n "+customer.getFirstName()
		+" " +customer.getLastNmae()+" "+game.getGameName()+"oyunu %"+String.valueOf(campain.getCampainRate())
		+" Kampanya ile ba�ar�l� bir �ekilde sat�� i�leminiz gerceklestirilmitir");
		
	}

}
