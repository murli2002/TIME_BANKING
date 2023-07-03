package net.javaguides.tb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private int credits;
    private Long contact_details;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long id, String username, int credits, Long contact_details) {
		super();
		this.id = id;
		this.username = username;
		this.credits = credits;
		this.contact_details = contact_details;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public Long getContact_details() {
		return contact_details;
	}
	public void setContact_details(Long contact_details) {
		this.contact_details = contact_details;
	}
	
	

}
