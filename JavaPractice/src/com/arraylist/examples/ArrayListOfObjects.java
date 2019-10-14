//When we are dealing with ArrayList of Objects then it
//is must to Override the toString() method in order to get the output in desired format. 

package com.arraylist.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListOfObjects
{
	String name;
	int age;
	public ArrayListOfObjects(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "Name of the student is: "+ this.name +" and age is: "+this.age;

	}

	public static void main(String a[])
	{
		ArrayList<ArrayListOfObjects> student = new ArrayList<ArrayListOfObjects>();
		student.add(new ArrayListOfObjects("Sravan", 24));
		student.add(new ArrayListOfObjects("Shravani", 74));
		student.add(new ArrayListOfObjects("Naveen", 44));

		Iterator<ArrayListOfObjects> iter = student.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		

	}

}
