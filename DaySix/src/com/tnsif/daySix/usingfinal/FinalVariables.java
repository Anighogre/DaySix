package com.tnsif.daySix.usingfinal;

public class FinalVariables {
	
	// final int x;  // final 
	final int x = 100;
	
	
	final static int y;
	
	final static int z = 10;
	
	// instance varaible
	
	void change ()
	{
		// x = 20; // can not change the final value
		// y =30;
	}

	@Override
	public String toString() {
		return "FinalVariables [x=" + x + ", y=" + y+ "]";
	}
	
	// declare a static block to initialize the final static variable
	
	static {
		y = 20;
		
		// y = 50; // we can not update values when we use final keyword
		
		System.out.println(y);
	}

	
}
