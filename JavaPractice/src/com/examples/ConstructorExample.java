package com.examples;

public class ConstructorExample
{
	String a;
	String b;
	
	public ConstructorExample()
	{
		
	}
	
	public ConstructorExample(String a, String b)
	{
		
	}
	
	public static void main(String[] args) 
	{
		
		ConstructorExample cons = new ConstructorExample("sravan", "bhuma");
		ConstructorExample cons2 = new ConstructorExample();
		System.out.println(cons2.a);
		
	}

}
