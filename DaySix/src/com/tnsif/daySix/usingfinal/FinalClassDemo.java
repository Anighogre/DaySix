package com.tnsif.daySix.usingfinal;

final class FinalClass {
	
	void show () 
	{
		System.out.println("Final class cannot be inherited");
	}
	
	
//	class A extends FinalClass
//	{
//		
//	}
	
}

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FinalClass f1 = new FinalClass();
		System.out.println(f1);
	}

}
