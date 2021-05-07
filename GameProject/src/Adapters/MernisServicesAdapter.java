package Adapters;

import Abstract.ICustomerCheckServices;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServicesAdapter implements ICustomerCheckServices{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		try {
            KPSPublicSoap client = new KPSPublicSoapProxy();

            boolean isValid = client.TCKimlikNoDogrula(
            		Long.valueOf(customer.getNationaltyId()),
            		customer.getFirstName().toUpperCase(),
            		customer.getLastNmae().toUpperCase()
            		,customer.getDateOfBirth().getYear());
            
            return isValid;
            
        } catch (Exception e) {

            System.out.println("Giriþ bilgileri doðru deðil");
        }
		return false;
	}

}
