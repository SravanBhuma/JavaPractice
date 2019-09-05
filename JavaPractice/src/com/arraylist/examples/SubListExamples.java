package com.arraylist.examples;

import java.util.ArrayList;
import java.util.List;

public class SubListExamples 
{
	public static void main(String a[]){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Steve");
		al.add("Justin");
		al.add("Ajeet");
		al.add("John");
		al.add("Arnold");
		al.add("Chaitanya");

		System.out.println("Original ArrayList Content: "+al);

		//Sublist to ArrayList
		ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
		System.out.println("SubList stored in ArrayList: "+al2);

		//Sublist to List
		//The subList method returns a list 
		//therefore to store the sublist in another ArrayList we must need to type cast the returned value

		List<String> list = al.subList(1, 4);
		System.out.println("SubList stored in List: "+list);
		
		System.out.println("First element of the ArrayList: "+al.get(0));
		
	}

}
