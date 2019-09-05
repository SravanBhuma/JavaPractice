package com.arraylist.examples;

import java.util.ArrayList;

public class ArrayListtoArray 
{
	public static void main(String[] args) {

		ArrayList<Integer> friendsnames= new ArrayList<Integer>();
		friendsnames.add(1);
		friendsnames.add(2);
		friendsnames.add(3);
		friendsnames.add(4);
		Integer frnames[]=friendsnames.toArray(new Integer[friendsnames.size()]);
		for(int k: frnames)
		{
			System.out.println(k);
		}
	}

}
