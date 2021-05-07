package Entities;

public class Campain
{
	private int id ;
	private String name;
	private int campainRate;
	public Campain(int id, String name, int campainRate) {
		super();
		this.id = id;
		this.name = name;
		this.campainRate = campainRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCampainRate() {
		return campainRate;
	}
	public void setCampainRate(int campainRate) {
		this.campainRate = campainRate;
	}
	
}
