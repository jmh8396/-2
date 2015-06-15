package model;

public class book {
	
	public String type;
	public String name;
	public Customer customer;
	
	public book(String type, String name) {
		this.type = type;
		this.name = name;
		this.customer = null;
	}
}
