package model;

import java.util.ArrayList;

public class bookSet {
	public String type;
	public ArrayList<book> books = new ArrayList<book>();
	
	public bookSet(String type) {
		this.type = type;
	}
}
