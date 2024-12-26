package com.tnsif.daySix.staticblock;

public class MyClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass o1 = new MyClass();
		System.out.println(o1);


		MyClass.display(); // call the static method from another class
		
		
		MyClass o2 = new MyClass();
		System.out.println(o2);

		MyClass.display();
	}

}
