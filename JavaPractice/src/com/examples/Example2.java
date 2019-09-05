package com.examples;

class Person 
{ 
	Person()
	{
		System.out.println("Base class");
	}
	Person(int i)
	{
		System.out.println("Base class parameterized");
	}
   int a = 20;
} 

class Student extends Person 
{ 
	Student(int i) 
	{ 
		System.out.println("Student class Constructor"); 
	} 
} 

public class Example2 
{

	public static void main(String[] args) 
	{
				Student s = new Student(10); 
	}

}
