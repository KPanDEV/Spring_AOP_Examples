package org.com.SpringAop.Examples;

public class ImplementA implements InterfaceA {

	public void methodA() {
		System.out.println("Invoking Main method A business logic");
	}
	
	public void methodA1()
	{
		System.out.println("Invoking Main method A1 business logic");
	}

	
	public int methodA2()
	{
		System.out.println("Invoking Main method A2 business logic");
		return 2;
	}
	
	public void methodB11()
	{
		System.out.println("Invoking Main Business Logic for B11");
	}
	
	public void methodB12()
	{
		System.out.println("Invoking Main Business Logic for B12");
	}
	
	public int methodB13()
	{
		System.out.println("Invoking Main Business Logic for B13");
		return 3;
	}

}
