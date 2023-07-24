package com.Exceptions;

public class ExceptionPropagation {

	public void method1()
	{
		System.out.println("inside method1");
		
		System.out.println(10/0);
		
	}
	
	public void method2()
	{
		
			method1();
		
		System.out.println("inside method2");
	}
	
	
	public void method3()
	{
		method2();
		System.out.println("inside method3");
	}
	
	public static void main(String[] args) {
		try
		{
		new ExceptionPropagation().method3();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

}