package com.database;

public class MySingleton {
	private static MySingleton s;
	private MySingleton() {
	System.out.println("Calling Constructor");
	}
	
	public void x() {
		System.out.println("Calling x");
	}
	
	public static MySingleton y() {
		System.out.println("Inside y");
		if (s == null);{
		s = new MySingleton();
	}
	return s;
	}

}
