import java.time.LocalDate;

import Abstract.ICustomerService;
import Adapters.MernisServicesAdapter;
import Concrate.CustomerCheckManager;
import Concrate.CustomerManager;
import Concrate.SalesManager;
import Entities.Campain;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		ICustomerService customermanager=new CustomerManager(new MernisServicesAdapter());
		Customer customer =new Customer("1234566788","Þimþek", "Mehmet", LocalDate.of(1999,10,8));
		customermanager.register(customer);
		Game game1=new Game(1,"Knight Online",123);
		Game game2=new Game(2,"Counter Strike",234);
		Campain campain1=new Campain(1,"Yaz Ýndirimi",30);
		Campain campain2=new Campain(2,"Kýþ Ýndirimi",40);
		SalesManager salesManager=new SalesManager();
		salesManager.sales(customer,game2, campain2);
		
		
		
		
		
	}

}
