package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity
{	private String nationaltyId;
	private String lastNmae;
	private String firstName;
	private LocalDate dateOfBirth;
	
	public Customer(String nationaltyId, String lastNmae, String firstName, LocalDate dateOfBirth) {
		super();
		this.nationaltyId = nationaltyId;
		this.lastNmae = lastNmae;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
