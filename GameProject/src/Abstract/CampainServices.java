package Abstract;

import Entities.Campain;

public abstract class CampainServices 
{
	void add(Campain campain)
	{
		System.out.println("Tebrikler %"+campain.getCampainRate()+" baþarý ile eklendi ");
	}
	void delete(Campain campain)
	{
		System.out.println("Tebrikler %"+campain.getCampainRate()+" baþarý ile silindi ");
	}
	void update(Campain campain)
	{
		System.out.println("Tebrikler %"+campain.getCampainRate()+" baþarý ile güncellendi ");
	}
}
