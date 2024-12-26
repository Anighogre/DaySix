package com.tnsif.daySix.staticblock;

public class MyClass {
	
	private int section;
	private static int srNo;
	static
	
	
	{
		System.out.println("----------- static block data----------");
		srNo = 1000;
	}
	
	public void data()
	{
		System.out.println("----------- static method ----------");
	}
	
	MyClass() {
		System.out.println("----------- default constructor ----------");
		srNo ++;
		section ++;
	}

	@Override
	public String toString() {
		return "MyClass [section= " + section + "]";
	}
	
	static void display ()
	{
		System.out.println("serial no " + srNo);

	}

}
