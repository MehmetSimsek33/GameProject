package Abstract;

import Entities.Campain;

public abstract class CampainServices 
{
	void add(Campain campain)
	{
		System.out.println("Tebrikler %"+campain.getCampainRate()+" ba�ar� ile eklendi ");
	}
	void delete(Campain campain)
	{
		System.out.println("Tebrikler %"+campain.getCampainRate()+" ba�ar� ile silindi ");
	}
	void update(Campain campain)
	{
		System.out.println("Tebrikler %"+campain.getCampainRate()+" ba�ar� ile g�ncellendi ");
	}
}
