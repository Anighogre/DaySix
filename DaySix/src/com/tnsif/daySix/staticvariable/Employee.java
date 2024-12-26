package com.tnsif.daySix.staticvariable;

public class Employee {

	private String name;
	private int id;
	
	
	// this variable is common for all the object
	static String companyName;
	
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", compaqnyName" + companyName + "]";
	}
	
}


