package com.arraylist.examples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraytoArrayList 
{
	public static void main(String[] args) {

		/* Array Declaration and initialization*/
		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		/*Array to ArrayList conversion*/
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
		citylist.add("Hyderabad");
		citylist.add("Chennai");
		for (String str: citylist)
		{
			System.out.println(str);
		}

		String newcitynames[]= {"Bangalore", "Amaravati"};
		Collections.addAll(citylist, newcitynames);

		for (String str: citylist)
		{
			System.out.println(str);
		}
	}
}
