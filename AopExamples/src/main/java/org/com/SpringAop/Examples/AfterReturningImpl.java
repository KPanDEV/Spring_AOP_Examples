package org.com.SpringAop.Examples;

public class AfterReturningImpl implements AfterReturningI {

	public int add(int a, int b) {
		System.out.println("Business Add Logic for AfterRunning");
		return (a+b);
	}

	public int sub(int a, int b) {
		System.out.println("Business Substract logic for AfterReturning");
		return (a-b);
	}

}
