package com.arraylist.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayInitialization 
{
	
	public static void main(String[] args)
	{
		
		ArrayList<Integer> example1 = new ArrayList<Integer>(Arrays.asList(3,4,2,5,1));
		ArrayList<Integer> example3 = new ArrayList<Integer>(Arrays.asList(3,4,2,5,1));
		System.out.println(example1.equals(example3));
		Collections.sort(example1);
		System.out.println("example1 ArrayList:"+ example1);
		
		
		
		
		Collections.sort(example3, Collections.reverseOrder());
		System.out.println("example3 ArrayList:"+ example3);
		
		
		 


		//	      Collections.ncopies method can be used when we need to initialize the ArrayList with the same value for all of its elements. 
		//	      Syntax: count is number of elements and element is the item value
		//	      ArrayList<T> obj = new ArrayList<T>(Collections.nCopies(count, element));

		ArrayList<Integer> example2 = new ArrayList<Integer>(Collections.nCopies(10, 5));
		Iterator<Integer> iter = example2.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		example3.addAll(2,example2);
		System.out.println("example3 ArrayList:"+ example3);
		
		example3.remove(10);
		System.out.println("example3 ArrayList:"+ example3);
		
		
		System.out.println("Last occurrence of element 5 in ArrayList: "+example3.lastIndexOf(5));
		System.out.println("First occurrence of element 5 in ArrayList: "+example3.indexOf(5));
		System.out.println("Element 11 exists in ArrayList: "+example3.contains(11));
	}

}
